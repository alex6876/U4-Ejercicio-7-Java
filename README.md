Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Facturación y Descuentos por Tipo de Cliente (Clases Abstractas, Herencia y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🧾 Simulación de Facturación y Descuentos por Tipo de Cliente (Clases Abstractas y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de facturación comercial, implementando una arquitectura basada en clases abstractas y herencia para administrar distintos perfiles de clientes (regulares, corporativos y prémium) con reglas especializadas de cálculo de bonificaciones y descuentos aplicados sobre las ventas. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la utilización de constructores mediante `super`, la implementación obligatoria de contratos en clases abstractas (`abstract`), la sobrescritura polimórfica de comportamiento (`@Override`) y la inyección de dependencias por parámetros en componentes de procesamiento en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base abstracta, sus respectivas subclases especializadas, un componente facturador y un punto de ejecución:

* **`Cliente` (Clase Abstracta)**: Centraliza los atributos y comportamientos comunes de cualquier comprador registrado en el sistema.
* **Atributos protegidos (`protected`)**: `nombre` y `dni`, permitiendo que las clases hijas accedan directamente a la identidad básica de la persona.
* **Constructor**: Inicializa los datos comunes de identificación del cliente.
* **Métodos operativos**:
* `abstract double aplicarDescuento(double subtotal)`: Método abstracto que obliga a cada tipo de cliente a implementar su propio algoritmo de cálculo de descuento.




* **`ClienteRegular`**: Extiende de `Cliente` para modelar compradores estándar con bonificaciones básicas.
* **Sobrescritura (`@Override`)**:
* `aplicarDescuento(double subtotal)`: Calcula una rebaja del 5% sobre el subtotal de la venta (`subtotal * 0.05`).




* **`ClienteCorporativo`**: Extiende de `Cliente` para modelar cuentas empresariales con esquemas especiales de bonificación por volumen.
* **Sobrescritura (`@Override`)**:
* `aplicarDescuento(double subtotal)`: Aplica el coeficiente corporativo correspondiente sobre el monto de la compra.




* **`ClientePremium`**: Extiende de `Cliente` para modelar usuarios con membresía de alto nivel y beneficios preferenciales.
* **Sobrescritura (`@Override`)**:
* `aplicarDescuento(double subtotal)`: Computa un descuento preferencial del 20% sobre el subtotal (`subtotal * 0.20`).




* **`Factura`**: Componente controlador encargado de gestionar el proceso comercial y la emisión de comprobantes.
* **Método operativo**: `procesarVenta(Cliente cliente, subtotal)`: Recibe de forma polimórfica cualquier tipo de cliente, invoca dinámicamente su método de descuento, calcula el total final y despliega por consola el detalle estructurado de la factura.


* **`Main`**: Punto de entrada del programa. Instancia un cliente regular, uno corporativo y uno prémium con sus respectivos datos identificatorios, instancia un objeto `Factura` y procesa diversas ventas de prueba para demostrar la resolución polimórfica de los descuentos.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Contrato Estricto de Descuentos:** Mediante el uso de la clase abstracta `Cliente`, el sistema garantiza que cualquier nueva categoría de comprador que se incorpore en el futuro implemente obligatoriamente la lógica para calcular sus propias bonificaciones.
2. **Desacoplamiento y Polimorfismo:** La clase `Factura` opera de manera totalmente agnóstica respecto a las subclases concretas; interactúa exclusivamente con la superclase abstracta, aplicando ligadura dinámica en tiempo de ejecución al invocar `cliente.aplicarDescuento(...)`.
3. **Estandarización de Comprobantes:** El sistema unifica la presentación visual de las operaciones comerciales imprimiendo de manera uniforme los datos del cliente, el subtotal, el descuento obtenido y el total a pagar.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
===== FACTURA =====
Cliente: Juan
DNI: 47.585.155
Subtotal: 12000.0
Descuento: 600.0
Total: 11400.0
===================
===== FACTURA =====
Cliente: Mirta
DNI: 45.784.254
Subtotal: 240000.0
Descuento: 8400000.0
Total: 8160000.0
===================
===== FACTURA =====
Cliente: Juan
DNI: 46.001.245
Subtotal: 1800000.0
Descuento: 360000.0
Total: 1440000.0
===================

```

---

## 🚀 Conceptos de Programación Aplicados

* **Abstracción y Polimorfismo Comercial:** Modelado unificado de clientes heterogéneos mediante contratos en clases abstractas y resolución dinámica de métodos.
* **Separación de Responsabilidades:** Clara división entre los datos y reglas de descuento de cada cliente, el componente de gestión de ventas (`Factura`) y la inicialización en el cliente (`Main`).
* **Diseño Extensible (OCP):** Capacidad absoluta para incorporar nuevos tipos de clientes al sistema comercial sin modificar la lógica interna del facturador.
