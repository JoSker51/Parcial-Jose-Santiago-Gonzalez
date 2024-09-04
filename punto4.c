#include <stdio.h>
#include <time.h>

int main() {
    long long int suma = 0;
    long long int n = 1000000000; // 1 billón

    // Iniciar el temporizador
    clock_t start = clock();

    // Calcular la suma de los primeros N números
    for (long long int i = 1; i <= n; i++) {
        suma += i;
    }

    // Finalizar el temporizador
    clock_t end = clock();
    double time_spent = (double)(end - start) / CLOCKS_PER_SEC;

    printf("Suma: %lld\n", suma);
    printf("Tiempo de ejecución en C: %f segundos\n", time_spent);

    return 0;
}

