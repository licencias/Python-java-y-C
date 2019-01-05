package tarea;


public class Hormiga 
{

	private int tamCarril;
	protected int carril[];
	protected boolean visitado[];
	protected int pos;
	

	public Hormiga(boolean[]p) 
	{
		this.tamCarril = p.length;
		this.carril = new int[tamCarril];
		this.visitado = new boolean[tamCarril];
	}

	protected void visitCity(int currentIndex, int city) 
	{

		carril[currentIndex] = city;
		pos = city;
		visitado[city] = true;
	}

	protected boolean pasada(int i)
	{
		return visitado[i];
	}

	protected double largoCarril(double graph[]) 
	{
		double length = 0;
		for (int i = 0; i < tamCarril; i++) 
		{
			length += graph[carril[i]];
		}
		return length;
	}

	protected void clear() 
	{
		for (int i = 0; i < tamCarril; i++)
			visitado[i] = false;
	}

}
