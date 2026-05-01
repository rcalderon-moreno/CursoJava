package com.roger.conceptos1.excepciones;

public class ExcepcionesPersonalizadas {

    public static void validarPromedioBeca(double valorNotaPromedio) {
        try {
            if (valorNotaPromedio<3.7)
                throw new PromedioDeCarreraInsuficiente("Promedio de carrera no es suficiente para obtener la beca");
        } catch (Exception e) {
            System.out.println("Capturado en main: " + e.getMessage());
        }
    }

    public static void solicitarDescuentos() throws EstudianteNoMatriculado {
        //código .................................
        //throw new EstudianteNoMatriculado();
        throw new EstudianteNoMatriculado("El estudiante no tiene inscritos los cursos!");
    }


    public static void validarPromedioBecaNew(double valorNotaPromedio) throws PromedioDeCarreraInsuficiente {
        if (valorNotaPromedio<3.7)
            throw new PromedioDeCarreraInsuficiente("Promedio de carrera no es suficiente para obtener la beca!!!");

    }



    static void main() throws PromedioDeCarreraInsuficiente, EstudianteNoMatriculado {

        validarPromedioBeca(3.0);
        try {
                validarPromedioBecaNew(3.0);
        } catch (Exception e) {
            System.out.println("Capturado en main: " + e.getMessage());
        }

        try {
            solicitarDescuentos();
        } catch (Exception e) {
            System.out.println("Capturado en main: " + e.getMessage());
        }




    }
}
