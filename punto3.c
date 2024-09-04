#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Función que cuenta cuántas veces aparece una palabra específica en el archivo dado
int buscar_palabra(FILE *fichero, const char *palabra_buscada) {
    int coincidencias = 0, longitud_palabra = strlen(palabra_buscada);
    char *linea = NULL;
    size_t longitud_linea = 0;
    ssize_t caracteres_leidos;

    // Leer el archivo línea por línea
    while ((caracteres_leidos = getline(&linea, &longitud_linea, fichero)) != -1) {
        char *posicion = linea;
        // Buscar la palabra dentro de la línea actual
        while ((posicion = strstr(posicion, palabra_buscada)) != NULL) {
            coincidencias++;
            posicion += longitud_palabra; // Avanzar el puntero para seguir buscando en la línea
        }
    }

    free(linea); // Liberar la memoria usada por getline
    return coincidencias;
}

int main(int argc, char **argv) {
    // Verificar el número correcto de argumentos
    if (argc != 3) {
        fprintf(stderr, "Uso adecuado: %s <archivo> <key= palabra_clave>\n", argv[0]);
        return 1;
    }

    const char *archivo_entrada = argv[1];
    const char *argumento_completo = argv[2];

    // Buscar la palabra clave dentro del argumento proporcionado
    const char *clave = strstr(argumento_completo, "key=");
    if (clave) {
        clave += 4; // Mover el puntero para saltar "key= "
    } else {
        fprintf(stderr, "Formato incorrecto: se esperaba 'key= palabra_clave'.\n");
        return 1;
    }

    // Abrir el archivo en modo lectura
    FILE *fichero = fopen(archivo_entrada, "r");
    if (!fichero) {
        perror("No se pudo abrir el archivo");
        return 1;
    }

    // Contar cuántas veces aparece la palabra clave en el archivo
    int total_coincidencias = buscar_palabra(fichero, clave);
    printf("La palabra '%s' aparece %d veces en el archivo.\n", clave, total_coincidencias);

    fclose(fichero);
    return 0;
}

