
def promedio(suma, cont):

    return suma / cont

def menor(lista):
    return lista[0]
def mayor(lista):
    return lista[len(lista)-1]

def main():

    numero = 2
    lista=[]
    while(numero < 3):
        numero: int = int(input("ingrese una cantidad de datos a ingresar mayor a 3:  "))
        cont = 0
        suma = 0
        i = 0
        j = 0

    while (i < numero):

        entrada = int(input("ingrese elemento nuevo:  "))

        if (entrada >= 0):  # con esto se verifíca que el numero es siempre positivo
            lista.append(entrada)
            cont = cont + 1
            suma = suma + entrada
            j = j + 1

            i = i + 1
        else:
            print("no puede ingresar ese dato")

    print("El promedio es :  ")
    print(promedio(suma,cont))
    lista.sort()
    print("El elemento minimo es :  ")
    print(menor(lista))
    print("El elemento maximo es :  ")
    print(mayor(lista))
main()