from tkinter import *
import matplotlib.pyplot as plt 
from mpl_toolkits.mplot3d import Axes3D
import numpy as np
import math

def funcion():
    x = np.array(range(20))*0.1
    y = np.zeros(len(x))

    for i in range(len(x)):
        y[i] = math.sin(x[i])

    plt.ion()
    plt.plot(x,y)

def grafico():
    fig = plt.figure()
    ax = fig.add_subplot(111, projection = '3d')

    n = 100

    def randrange(n, vmin, vmax):
        return (vmax-vmin)* np.random.rand(n) + vmin

    for c,m,zl,zh in [('r','o',-50,-25),('b','^',-30,-5)]:
        xs = randrange(n,23,32)
        ys = randrange(n,0,100)
        zs = randrange(n,zl,zh)
        ax.scatter(xs,ys,zs,c=c,marker=m)

    ax.set_xlabel('X label')
    ax.set_ylabel('Y label')
    ax.set_zlabel('Z label')
    
    plt.show()

def main():
    ventana = Tk()
    ventana.geometry("600x400")
    ventana.geometry("600x400+0+0")
    ventana.maxsize(600,400)
    ventana.minsize(600,400)

    ventana.title("graficos")
    mensaje = Label(ventana,text = "Seleccionar")
    botones = Button(ventana,text = "Generar modelo",command=grafico).place(x = 270, y = 40)
    botones2 = Button(ventana,text = "Estadística",command=funcion).place(x = 270, y = 20)

    entradaU=StringVar()
    txtUsuario=Entry(ventana,textvariable=entradaU).place(x = 70, y = 20)
    lblNombre=Label(text="BLOCK",font=("Agency FB",10)).place(x=10,y=20)

    entradaV=StringVar()
    txtUsuario=Entry(ventana,textvariable=entradaV).place(x = 70, y = 40)
    lblNombre=Label(text="SIZE",font=("Agency FB",10)).place(x=10,y=40)

    entradaW=StringVar()
    txtUsuario=Entry(ventana,textvariable=entradaW).place(x = 70, y = 60)
    lblNombre=Label(text="rand",font=("Agency FB",10)).place(x=10,y=60)

    mensaje.pack()

    ventana.mainloop()
main()


