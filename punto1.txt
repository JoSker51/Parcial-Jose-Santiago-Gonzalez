#!/usr/bin/awk -f

# Función para determinar el token basado en la expresión regular
function obtener_token(expresion) {
    if (expresion ~ /^\+\+$/) {
        return "INCR"
    } else if (expresion ~ /^\+$/) {
        return "SUMA"
    } else if (expresion ~ /^[0-9]+$/) {
        return "ENTERO"
    } else if (expresion ~ /^[0-9]+\.[0-9]+$/) {
        return "REAL"
    } else {
        return "Expresión no reconocida"
    }
}

BEGIN {
    if (ARGC != 2) {
        print "Uso: awk -f AFD.awk <expresion_regular>"
        exit 1
    }
    
    expresion = ARGV[1]
    token = obtener_token(expresion)
    print token
}

