# -*- coding: cp1252 -*-
def semanita():
    numero = input("Dime un numero del 1 al 7:")
    semana = ["Lunes", "Martes","Miércoles","Jueves","Viernes","sabado","Domingo"]
   if numero>7:
       print "ERROR GILIPOLLAS"
    else:
            print semana[numero - 1]
    
semanita()
