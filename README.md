# Sistema de Gestión de Drones

## Descripción

Este proyecto consiste en un sistema desarrollado en Java aplicando Programación Orientada a Objetos (POO) para gestionar diferentes tipos de drones y calcular el costo de entrega según sus características.

El sistema permite:

- Registrar información de drones.
- Validar datos ingresados.
- Calcular costos de entrega.
- Aplicar herencia y polimorfismo.
- Mostrar información de cada dron.

---

# Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Scanner para entrada de datos
- IntelliJ IDEA / VS Code / NetBeans

---

# Estructura del proyecto

```text
src/
│
├── Dron.java
├── DronLiviano.java
├── DronCarga.java
├── DronEmergencia.java
└── Main.java
```

---

# Clases del sistema

## 1. Clase abstracta `Dron`

Clase base del sistema.

### Atributos principales

- codigo
- modelo
- distanciaKm
- pesoPaquete
- horasVuelo
- costoBase

### Métodos

- getters y setters
- calcularCostoEntrega()
- validarDatos()
- mostrarInformacion()

---

## 2. Clase `DronLiviano`

Hereda de `Dron`.

### Reglas

- Peso máximo: 5 kg
- Horas máximas: 2 horas

### Fórmula de costo

```text
costo = costoBase + (distanciaKm * 0.50)
```

---

## 3. Clase `DronCarga`

Hereda de `Dron`.

### Reglas

- Peso máximo: 30 kg
- Horas máximas: 5 horas

### Fórmula de costo

```text
costo = costoBase +
        (distanciaKm * 0.70) +
        (pesoPaquete * costoPorKg)
```

---

## 4. Clase `DronEmergencia`

Hereda de `Dron`.

### Reglas

- Peso máximo: 10 kg
- Horas máximas: 3 horas
- Nivel de prioridad entre 1 y 3

### Fórmula de costo

```text
costo = costoBase +
        (distanciaKm * 1.0) +
        recargoUrgencia
```

---

# Conceptos POO aplicados

- Clase abstracta
- Herencia
- Encapsulamiento
- Polimorfismo
- Sobrescritura de métodos
- Getters y Setters
- Validaciones

---

# Funcionamiento del programa

1. Se crean objetos de cada tipo de dron.
2. Se asignan datos iniciales.
3. Se muestra la información.
4. Se solicitan nuevos datos mediante Scanner.
5. Se validan los datos ingresados.
6. Se demuestra el polimorfismo utilizando referencias tipo `Dron`.

---

# Ejemplo de salida

```text
===== DRON LIVIANO =====
Código: DL01
Modelo: MiniFly
Distancia: 10.0 km
Peso: 3.0 kg
Horas de vuelo: 1.5
Costo total: $8.0
```
