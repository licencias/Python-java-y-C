package tarea;

import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class Colonia
{
	
	//Variables de instancia.
	private ArrayList < Hormiga > hormigas = new ArrayList < Hormiga > ();
	private static final boolean comunas[]=
		{
				false,false,false,false,false,false,false,false,false,false,false,false,
				false,false,false,false,false,false, false,false,false,false,false,false,
				false,false,false,false,false,false,false,false,false,false,false,false
		};

	private static final double[] costo= 
		{	
				1,2,1.2,1.5,3,2,1,1,3,4,3,3,2,2.5,1.5,2,2,3,
				2,2,3,2,3,3,1,2.5,2,3.5,3,1.5,2,2,3.5,2,2.5,1.5
		};
	
	private static final int numComunas = comunas.length;
	private double Probabilidades[];
	private boolean gBest[];	
	private boolean auxBest[]= null,	pBest[]=null;
	private boolean [][]cobertura;
	private double auxfitness = 0, pfitness = 0;
	private double gfitness = 0; 
	private int numHormigas; 		
	private int iteraciones;
	private int indice = 0;
	private double carriles[];
	private double evaporacion;
	private Random random = new Random();
    private double alpha = 1;
    private double Q = 500;
    private double beta = 5;
    private double factorAleatorio = 0.01;
   
	
	public Colonia(){
		this.gBest = comunas.clone();
		this.carriles = new double[numComunas];
		this.cobertura = new boolean [gBest.length][gBest.length];
		
		this.numHormigas = 20; //number of ant
		this.iteraciones = 500; //number of iterations
		this.evaporacion = 0.5;
		this.Probabilidades = new double[numComunas];
		
		System.out.println("numero de comunas: " + numComunas);
		
	
		
		
		for (int i = 1; i <= numHormigas; i++)
		{
			hormigas.add(new Hormiga(gBest));
		}
		
		for(int i=0;i<cobertura.length;i++)
		{
			for(int k=0;k<cobertura.length;k++)
			{
				cobertura[i][k]=false;
				if(i==k)
					cobertura[i][k]=true;
			}
			
		}
		
		
		//comunas y vecindad
		cobertura[2-2][3-2]=true;	cobertura[2-2][4-2]=true;	cobertura[2-2][28-2]=true;
		cobertura[3-2][4-2]=true;	cobertura[3-2][5-2]=true;	cobertura[3-2][28-2]=true;	cobertura[3-2][29-2]=true;
		cobertura[4-2][2-2]=true;	cobertura[4-2][3-2]=true;	cobertura[4-2][25-2]=true;	cobertura[4-2][26-2]=true;	cobertura[4-2][28-2]=true;
		cobertura[5-2][3-2]=true;	cobertura[5-2][27-2]=true;	cobertura[5-2][29-2]=true;
		cobertura[6-2][7-2]=true;	cobertura[6-2][9-2]=true;	cobertura[6-2][15-2]=true;	cobertura[6-2][24-2]=true;	cobertura[6-2][27-2]=true;cobertura[6-2][28-2]=true;
		cobertura[7-2][6-2]=true;	cobertura[7-2][8-2]=true;	cobertura[7-2][9-2]=true;	cobertura[7-2][10-2]=true;	cobertura[7-2][15-2]=true;
		cobertura[8-2][7-2]=true;	cobertura[8-2][10-2]=true;
		cobertura[9-2][7-2]=true;	cobertura[9-2][6-2]=true;
		cobertura[10-2][7-2]=true;	cobertura[10-2][8-2]=true;	cobertura[10-2][15-2]=true;	cobertura[10-2][33-3]=true;
		cobertura[11-2][12-2]=true;	cobertura[11-2][13-2]=true;	cobertura[11-2][15-2]=true;	cobertura[11-2][16-2]=true;	cobertura[11-2][17-2]=true;cobertura[11-2][24-2]=true;cobertura[11-2][25-2]=true;
		cobertura[12-2][11-2]=true;	cobertura[12-2][13-2]=true;	cobertura[12-2][15-2]=true;	cobertura[12-2][17-2]=true;
		cobertura[13-2][11-2]=true;	cobertura[13-2][12-2]=true;	cobertura[13-2][15-2]=true;	cobertura[13-2][17-2]=true;	cobertura[13-2][33-3]=true;
		cobertura[14-2][16-2]=true;	cobertura[14-2][17-2]=true;	cobertura[14-2][31-2]=true;	cobertura[14-2][34-3]=true;	cobertura[14-2][35-3]=true;cobertura[14-2][37-3]=true;cobertura[14-2][38-3]=true;
		cobertura[15-2][6-2]=true;	cobertura[15-2][7-2]=true;	cobertura[15-2][10-2]=true;	cobertura[15-2][11-2]=true;	cobertura[15-2][12-2]=true;cobertura[15-2][13-2]=true;cobertura[15-2][24-2]=true;cobertura[15-2][33-3]=true;
		cobertura[16-2][11-2]=true;	cobertura[16-2][14-2]=true;	cobertura[16-2][17-2]=true;	cobertura[16-2][34-3]=true;
		cobertura[17-2][11-2]=true;	cobertura[17-2][12-2]=true;	cobertura[17-2][13-2]=true;	cobertura[17-2][14-2]=true;	cobertura[17-2][16-2]=true;cobertura[17-2][31-2]=true;cobertura[17-2][33-3]=true;cobertura[17-2][35-3]=true;
		cobertura[18-2][20-2]=true;	cobertura[18-2][30-2]=true;
		cobertura[19-2][21-2]=true;	cobertura[19-2][22-2]=true;	cobertura[19-2][30-2]=true;
		cobertura[20-2][18-2]=true;	cobertura[20-2][21-2]=true;	cobertura[20-2][30-2]=true;
		cobertura[21-2][19-2]=true;	cobertura[21-2][20-2]=true;	cobertura[21-2][30-2]=true;
		cobertura[22-2][23-2]=true;	cobertura[22-2][19-2]=true;
		cobertura[23-2][22-2]=true;
		cobertura[24-2][6-2]=true;	cobertura[24-2][11-2]=true;	cobertura[24-2][15-2]=true;	cobertura[24-2][25-2]=true;	cobertura[24-2][26-2]=true;cobertura[24-2][27-2]=true;cobertura[24-2][28-2]=true;
		cobertura[25-2][4-2]=true;	cobertura[25-2][11-2]=true;	cobertura[25-2][24-2]=true;	cobertura[25-2][26-2]=true;
		cobertura[26-2][4-2]=true;	cobertura[26-2][24-2]=true;	cobertura[26-2][25-2]=true;	cobertura[26-2][28-2]=true;
		cobertura[27-2][5-2]=true;	cobertura[27-2][6-2]=true;	cobertura[27-2][24-2]=true;	cobertura[27-2][28-2]=true;	cobertura[27-2][29-2]=true;
		cobertura[28-2][2-2]=true;	cobertura[28-2][3-2]=true;	cobertura[28-2][4-2]=true;	cobertura[28-2][6-2]=true;	cobertura[28-2][24-2]=true;cobertura[28-2][26-2]=true;cobertura[28-2][27-2]=true;cobertura[28-2][29-2]=true;
		cobertura[29-2][3-2]=true;	cobertura[29-2][5-2]=true;	cobertura[29-2][27-2]=true;	cobertura[29-2][28-2]=true;
		cobertura[30-2][18-2]=true;	cobertura[30-2][19-2]=true;	cobertura[30-2][20-2]=true;	cobertura[30-2][21-2]=true;	cobertura[30-2][34-3]=true;cobertura[30-2][36-3]=true;
		cobertura[31-2][14-2]=true;	cobertura[31-2][17-2]=true;	cobertura[31-2][34-3]=true;	cobertura[31-2][35-3]=true;	cobertura[31-2][38-3]=true;
		cobertura[33-3][10-2]=true;	cobertura[33-3][13-2]=true;	cobertura[33-3][15-2]=true;	cobertura[33-3][17-2]=true;	cobertura[33-3][35-3]=true;
		cobertura[34-3][14-2]=true;	cobertura[34-3][16-2]=true;	cobertura[34-3][30-2]=true;	cobertura[34-3][31-2]=true;	cobertura[34-3][36-3]=true;cobertura[34-3][37-3]=true;cobertura[34-3][38-3]=true;
		cobertura[35-3][17-2]=true;	cobertura[35-3][31-2]=true;	cobertura[35-3][33-3]=true;
		cobertura[36-3][30-2]=true;	cobertura[36-3][34-3]=true;	cobertura[36-3][38-3]=true;
		cobertura[37-3][14-2]=true;	cobertura[37-3][34-3]=true;
		cobertura[38-3][14-2]=true;	cobertura[38-3][31-2]=true;	cobertura[38-3][34-3]=true;	cobertura[38-3][36-3]=true;
	
				
		while(verificarCovertura(gBest) == false)
		{
			int k=0;
			
			for( k=0; k < gBest.length ;k++)
			{
				gBest[k]=false;;
			}
			k=0;
			
			for(Hormiga p: hormigas)
			{
				
				k= (int)(random.nextDouble() * numComunas);
				if(k >= numComunas)
					k=0;
				p.visitCity(0, k);
				gBest[p.pos]=true;
				//System.out.println("numero: " + k);
			}
		}
		gfitness = calcularFitness(gBest);
		mostrarSolucion();
	}
	
    public void calculateProbabilities(Hormiga hormiga)  //Calcular probabilidad
    {
        double feromona = 0.0;
        for (int i = hormiga.pos; i < numComunas; i++) 
        {
            if (!hormiga.pasada(i)) 
            {
                feromona += Math.pow(carriles[i], alpha) * Math.pow(1.0 / costo[i], beta);
            }
        }
        for (int j = 0; j < numComunas; j++) 
        {
        	
            if (hormiga.pasada(j) || feromona== 0 ) 
            {
                Probabilidades[j] = 0.0;
            } else {
                double numerator = Math.pow(carriles[j], alpha) * Math.pow(1.0 / costo[j], beta);
                Probabilidades[j] = numerator / feromona;
            }
        }
    }
    
	private void actualizarCarriles() 
	{
        for (int i = 0; i < numComunas; i++) 
        {
                carriles[i] *= evaporacion;
        }
        for (Hormiga a : hormigas) 
        {
            double contribution = Q / a.largoCarril(costo);
            for (int i = 0; i < numComunas ; i++) 
            {
                carriles[a.carril[i]] += contribution;
            }
        }
    }

	

	private double calcularFitness(boolean[] best) 
	{
		double sum = 0;
		
		for(int i = 0; i<best.length;i++)
		{
			if(best[i])
			{
				sum +=costo[i];
			}
		}
		return sum;
	}

	//System.out.println("final fitness: " + gfitness);

	private boolean verificarCovertura(boolean[] solucion)
	{
		boolean sol[];
		sol = comunas.clone();
		
		for(int i=0; i < solucion.length;i++)
		{
			
			if(solucion[i]==true)
			{							// instala antena
				for(int k=0; k < solucion.length;k++)
				{		// agregar cobertura de antena 
					
					if(cobertura[i][k]==true)
					{			
						sol[k] = true;
						
					}		
				}
			}	
		}
		for(int i=0; i<sol.length;i++){
			if(sol[i] == false){							// verifica cobertura 
				return false;
			}
		}
		return true;
	}
	
	public void mostrarSolucion(){   	//Muestra los mejores resultados
		
		System.out.print("Costo total: " + gfitness);
		
		System.out.print("	Comunas: ");
		System.out.print(" --> [ ");
		for(int i=0;i<gBest.length;i++){
			System.out.print(", " + gBest[i]);
		}
		System.out.println(" ]");
	}


    private int siguienteComuna(Hormiga hormiga,int currentI)  //Selecciona la siguiente ciudad 
    {
        int t = random.nextInt(numComunas - currentI);
        double r = random.nextDouble();
        double total = 0;

        for (int i = 0; i < numComunas; i++) 
        {
            total += Probabilidades[i];
            if (total >= r) 
            {
                return i;
            }
        }
        
        if (random.nextDouble() < factorAleatorio) 
        {
            OptionalInt cityIndex = IntStream.range(0, numComunas)
                .filter(i -> i == t && !hormiga.pasada(i))
                .findFirst();
            if (cityIndex.isPresent()) 
            {
                return cityIndex.getAsInt();
            }
        }
        calculateProbabilities(hormiga);


		return -1;
    }
	public void Comenzar() 
	{
		int k = 0;
		int city=0;
		
		pBest=gBest.clone();
		auxBest=gBest.clone();
		
		gfitness = calcularFitness(pBest);
		auxfitness = pfitness = gfitness;
		
		System.out.println("execute.. ");

		//ACO algorithm
		while (k <= iteraciones) 
		{ 
			
			actualizarCarriles();
			for (Hormiga p: hormigas) 
			{ 	
				
				indice=0;      //desde k = 1 hasta n hormigas
				auxBest= pBest.clone();
				while (verificarCovertura(auxBest) == false ||  indice < 1) { 
					auxBest[p.pos]=false;
					
					city = siguienteComuna( p,indice);
					if(city == -1)
						city = indice;
					
					p.visitCity(indice, city ); 
					
					auxBest[p.pos]=true; 	//Agrega la solucion por iteracion
					
					indice++;
					if(indice < numComunas)
						break;
				
				}
				
				if(verificarCovertura(auxBest)){
					auxfitness = calcularFitness(auxBest);
					if (pfitness > auxfitness || (pfitness == auxfitness && costo[city]<costo[p.pos]) ) { 	//Guarga la mejor solucion en cada iteracion.
						pfitness = auxfitness;
						pBest 	 = auxBest.clone();
					}
				}
			}
			
			pfitness = calcularFitness(pBest);
			if (gfitness > pfitness)  //Actualiza el mejor
			{ 		
				gfitness = pfitness;
				gBest 	 = pBest.clone();
			}

			k++;
			mostrarSolucion();
		}
		System.out.println("****************************************************************************************************");

		System.out.println("\n La mejor solucion es: ");
		mostrarSolucion();
	}


    


	
}
