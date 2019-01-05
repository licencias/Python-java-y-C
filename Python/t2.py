from openpyxl import load_workbook

import os


def menu():
    os.system('cls')
    print("selecciona una opcion")
    print("1 primera opcion")
    print("2 segunda opciona")
	print("3 tercera opcion")
	print("4 cuarta opcion")
	print("9 - salir")

while True:
    # Mostramos el menu
    menu()

    # solicituamos una opción al usuario
    opcionMenu = int(input("inserta un numero valor >> "))

    if opcionMenu == 1:
        print ("")
        input("Has pulsado la opción 1...\npulsa una tecla para continuar")
    elif opcionMenu == 2:
        print ("")
        input("Has pulsado la opción 2...\npulsa una tecla para continuar")
    elif opcionMenu == 3:
        print ("")
        input("Has pulsado la opción 3...\npulsa una tecla para continuar")

    elif opcionMenu == 9:
        break
    else:
        print ("")
        input("No has pulsado ninguna opción correcta...\npulsa una tecla para continuar")
