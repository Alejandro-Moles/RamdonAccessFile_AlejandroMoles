# RamdonAccessFile_AlejandroMoles
Alejandro Moles Hurtado:


El programa funciona de tal manera: Cuando se ejecuta, si no hay ningun fichero en el que se guardan los registros, saltara un mensaje se fichero no encontrado, pero solo hay que darle a 
aceptar y se abrira el programa. Cuando se da de alta al primer alumno se crea el fichero ejemplo.txt donde se guardaran los registros. Alumno consta de cuatro campos, Matricula(Int), 
Primer Nombre(String), Nota(Double) y Sexo(Char). El prograam controla todas las excepciones que se pueden producir al ingresar campos incorrectos. Cuando se da de baja a un alumno no se 
borra del fichero en si, si no que el valor de matricula pasa a ser 0, eso quiere decor que todas la matriculas con valor 0 no pueden ser leidas, creadas etc. 
Cuando se modifica un registro, se tiene que insertar la matricula, y todos los otros campos sin saltarse ninguno. Cuando se busca un registro, solo se tiene que insertar el valor de una 
matricula, y en una tabla que habrá debajo del boton buscar, aparecerá el registro de esa matricula.
Cada vez que se da de alta, o se borra, o se modifica una matricula de un alumno, aparecera modificada la tabla de la derecha, es decir si se da de alta parecera en la tabla un nuevo 
registro, si se borra desaparecerá y si se modifica se cambiará el registro.
En el codigo, dentro del programa, habrá comentario para explicar el funcionamiento de el mismo codigo.
