package com.roger.conceptos1.excepciones;




        public class EstudianteNoMatriculado extends Exception {
            public EstudianteNoMatriculado() {
                super("No fue posible conectar al servicio para validar" +
                        " si el estudiante tiene matricula vigente.");
            }
            public EstudianteNoMatriculado(String mensaje) {
                super(mensaje);
            }
        }
