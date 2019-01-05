#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(void)
{
    char cadena[200];
    FILE *archivo;          //file es un tipo de variable, para poder trabajar con ficheros o archivos. El puntero referencia la dirección de memoria de la variable.
    archivo = fopen("carpeta1/archivo1.txt","r");   //en este caso r solo para leer.
    fscanf(archivo," %[^\n]",cadena);            //que lea hasta el salto de linea.
    printf("%s",cadena);      //mostramos por pantalla la variable cadena
    system("pause");

    return 0;                   //para saber que el programa termino.
}