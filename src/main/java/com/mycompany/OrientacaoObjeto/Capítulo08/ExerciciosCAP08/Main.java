
package com.mycompany.OrientacaoObjeto.Capítulo08.ExerciciosCAP08;
import java.util.Scanner;
import com.mycompany.OrientacaoObjeto.Capítulo08.ExerciciosCAP08.Retangulo;
import com.mycompany.OrientacaoObjeto.Capítulo08.ExerciciosCAP08.Funcionarios;
import com.mycompany.OrientacaoObjeto.Capítulo08.ExerciciosCAP08.Estudantes;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("Entre com os valores de Altura e largura do Retangulo: ");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();
        System.out.println(retangulo.area());
        System.out.println(retangulo.Perimetro());
        System.out.println(retangulo.Diagonal());
        System.out.println("====================PROGRAMA ENCERRADO=========================");
        Funcionarios f = new Funcionarios();
        System.out.print("Informe o nome do Funcionario: ");
        f.nome = sc.next();
        System.out.print("Informe o salario bruto do Funcionario: ");
        f.salarioBruto = sc.nextDouble();
        System.out.print("Informe o imposto sobre o salario bruto: ");
        f.imposto = sc.nextDouble();
        f.imprimir();
        System.out.print("Quantos porcentos sera incrementado o salario?");
        int porcentagem = sc.nextInt();
        f.ModificarSalario(porcentagem);
        f.imprimir();
        System.out.println(f.salarioLiquido());
        System.out.println("===========PROGRAMA ENCERRADO======================================================");
        Estudantes estudante = new Estudantes();
        estudante.nome = sc.next();
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();
        System.out.println("A nota final do aluno e: " + estudante.notafinal());
        System.out.println("A situacao do aluno e: " + estudante.situacao());
        
         
    }
}
