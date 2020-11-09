def ejercicio_12():
    numero=input ("Introduce un numero de 4 cifras")
    for cont in range(3,0):
        divisor=10^cont 
        cociente=numero/divisor
        print cociente
        suma=suma+cociente
        numero=numero%divisor

ejercicio_12()
