def multiplicacion():
    producto=1
    print "Inserte 4 n�meros Reales"
    for cont in range(1,5):
        print "Inserte n�mero",cont,": "
        numero=input()
        producto=producto*numero
    print "El producto de los 4 n�meros es: ",producto
    
multiplicacion()
