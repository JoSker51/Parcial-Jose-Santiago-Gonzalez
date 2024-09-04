import time

suma = 0
n = 1000000000  # 1 billón

# Iniciar el temporizador
start_time = time.time()

# Calcular la suma de los primeros N números
for i in range(1, n + 1):
    suma += i

# Finalizar el temporizador
end_time = time.time()
time_spent = end_time - start_time

print(f"Suma: {suma}")
print(f"Tiempo de ejecución en Python: {time_spent} segundos")

