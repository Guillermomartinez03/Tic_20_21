'''Escribe un programa que genere'''
def contrasena():
    nombre=raw_input("Introduce el nombre: ")
    apellido=raw_input("Introduce el apellido: ")
    print nombre, " ",apellido, "eres el impostor?"
    print "Las tres inciales ",3*nombre+2*apellido
contrasena()
