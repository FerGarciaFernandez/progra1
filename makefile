limpiar:
	rm -rf bin
compilar:limpiar
	find src -name "*.java" | xargs javac -cp bin -d bin
ejecutar:compilar
	java -cp bin aplicacion.Principal
