def multiplicacion():
    producto=1
    print "Inserte 4 números Reales"
    for cont in range(1,5):
        print "Inserte número",cont,": "
        numero=input()
        producto=producto*numero
    print "El producto de los 4 números es: ",producto
    
multiplicacion()
