import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algoritmo01();
        Algoritmo02();
        Algoritmo03();
        Algoritmo04();
        Algoritmo05();
        Algoritmo06();
        Algoritmo07();
        Algoritmo08();
        Algoritmo09();
        Algoritmo10();
        Algoritmo11();
        Algoritmo15();
    }

    private static void Algoritmo01() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Algoritmo01");
        int numero1;
        int numero2;
        int operacao;
        int resultado;
        int continuar;

        do {
            System.out.print("Digite o primeiro numero: ");
            numero1 = entrada.nextInt();

            System.out.print("Digite o segundo numero: ");
            numero2 = entrada.nextInt();

            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao inteira");
            System.out.print("Escolha a operacao: ");
            operacao = entrada.nextInt();

            if (operacao == 1) {
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);

            } else if (operacao == 2) {
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);

            } else if (operacao == 3) {
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);

            } else if (operacao == 4) {
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);

            } else {
                System.out.println("Operacao invalida.");
            }

            System.out.print("Deseja continuar? 1-Sim / 0-Nao: ");
            continuar = entrada.nextInt();

        } while (continuar == 1);

        entrada.close();
    }

    private static void Algoritmo02() {
        System.out.print("----------------------------");
        System.out.print("Algoritmo02");
        int soma = 0;


        for (int numero = 1; numero <= 500; numero++) {

            if (numero % 2 != 0 && numero % 3 == 0) {
                soma = soma + numero;
            }
        }

        System.out.println("Soma: " + soma);
    }

    public static void Algoritmo03() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("----------------------------");
        System.out.print("Algoritmo03");
        int codigo;
        int meses;

        int menorMeses = 999999;
        int maiorMeses = 0;

        int empregadoRecente = 0;
        int empregadoAntigo = 0;

        int quantidadeEmpregados = 0;

        System.out.print("Digite o numero do empregado: ");
        codigo = entrada.nextInt();

        System.out.print("Digite os meses de trabalho: ");
        meses = entrada.nextInt();

        while (codigo != 0 && meses != 0
                && quantidadeEmpregados < 300) {

            quantidadeEmpregados++;

            if (meses < menorMeses) {
                menorMeses = meses;
                empregadoRecente = codigo;
            }

            if (meses > maiorMeses) {
                maiorMeses = meses;
                empregadoAntigo = codigo;
            }

            System.out.print("Digite o numero do empregado: ");
            codigo = entrada.nextInt();

            System.out.print("Digite os meses de trabalho: ");
            meses = entrada.nextInt();
        }

        System.out.println("Empregado mais recente: "
                + empregadoRecente);

        System.out.println("Empregado mais antigo: "
                + empregadoAntigo);

        entrada.close();
    }

    public static void Algoritmo04() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("----------------------------");
        System.out.print("Algoritmo04");

        double altura;
        double menorAltura = 999;
        double maiorAltura = 0;

        double somaMulheres = 0;
        double mediaMulheres;

        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        int sexo;
        int sexoMaisAlto = 0;

        for (int pessoa = 1; pessoa <= 15; pessoa++) {

            System.out.print("Digite a altura: ");
            altura = entrada.nextDouble();

            System.out.print("Digite o sexo (1-H / 2-M): ");
            sexo = entrada.nextInt();

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
                sexoMaisAlto = sexo;
            }

            if (sexo == 2) {
                somaMulheres = somaMulheres + altura;
                quantidadeMulheres++;
            } else {
                quantidadeHomens++;
            }
        }

        mediaMulheres = somaMulheres / quantidadeMulheres;

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Media das mulheres: " + mediaMulheres);
        System.out.println("Numero de homens: " + quantidadeHomens);

        if (sexoMaisAlto == 1) {
            System.out.println("Sexo da pessoa mais alta: Homem");
        } else {
            System.out.println("Sexo da pessoa mais alta: Mulher");
        }

        entrada.close();
    }

    public static void Algoritmo05() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("----------------------------");
        System.out.print("Algoritmo05");
        double salario;
        double somaSalarios = 0;
        double maiorSalario = 0;
        double mediaSalario;
        double mediaFilhos;
        double percentual;

        int filhos;
        int somaFilhos = 0;
        int quantidadePessoas = 0;
        int quantidadeAte250 = 0;

        System.out.print("Digite o salario: ");
        salario = entrada.nextDouble();

        while (salario >= 0) {

            System.out.print("Digite o numero de filhos: ");
            filhos = entrada.nextInt();

            somaSalarios = somaSalarios + salario;
            somaFilhos = somaFilhos + filhos;
            quantidadePessoas++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= 250) {
                quantidadeAte250++;
            }

            System.out.print("Digite o salario: ");
            salario = entrada.nextDouble();
        }

        mediaSalario = somaSalarios / quantidadePessoas;
        mediaFilhos = (double) somaFilhos / quantidadePessoas;
        percentual = (double) quantidadeAte250 * 100
                / quantidadePessoas;

        System.out.println("Media do salario: " + mediaSalario);
        System.out.println("Media de filhos: " + mediaFilhos);
        System.out.println("Maior salario: " + maiorSalario);
        System.out.println("Percentual com salario ate R$250: "
                + percentual + "%");

        entrada.close();
    }

    public static void Algoritmo06() {
        System.out.print("----------------------------");
        System.out.print("Algoritmo06");
        Scanner entrada = new Scanner(System.in);

        double valor;
        double soma = 0;
        double media;
        double percentualPositivos;
        double percentualNegativos;

        int quantidade = 0;
        int positivos = 0;
        int negativos = 0;

        System.out.print("Digite um valor (0 para encerrar): ");
        valor = entrada.nextDouble();

        while (valor != 0) {

            soma = soma + valor;
            quantidade++;

            if (valor > 0) {
                positivos++;
            } else {
                negativos++;
            }

            System.out.print("Digite um valor (0 para encerrar): ");
            valor = entrada.nextDouble();
        }

        media = soma / quantidade;

        percentualPositivos =
                (double) positivos * 100 / quantidade;

        percentualNegativos =
                (double) negativos * 100 / quantidade;

        System.out.println("Media: " + media);
        System.out.println("Quantidade de positivos: "
                + positivos);

        System.out.println("Quantidade de negativos: "
                + negativos);

        System.out.println("Percentual de positivos: "
                + percentualPositivos + "%");

        System.out.println("Percentual de negativos: "
                + percentualNegativos + "%");

        entrada.close();
    }

    public static void Algoritmo07() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("----------------------------");
        System.out.print("Algoritmo07");
        int valor;
        int soma = 0;
        double media;

        for (int valorLido = 1; valorLido <= 75; valorLido++) {

            System.out.print("Digite um valor: ");
            valor = entrada.nextInt();

            soma = soma + valor;
        }

        media = (double) soma / 75;

        System.out.println("Media: " + media);
        System.out.println("Quantidade de numeros lidos: 75");

        entrada.close();
    }

    public static void Algoritmo08() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("----------------------------");
        System.out.print("Algoritmo08");
        String nome;
        String nomeMaior = "";
        String nomeMenor = "";

        double altura;
        double maiorAltura = 0;
        double menorAltura = 999;

        double somaMulheres = 0;
        double somaHomens = 0;
        double somaTurma = 0;

        int sexo;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        double mediaMulheres;
        double mediaHomens;
        double mediaTurma;

        for (int amigo = 1; amigo <= 15; amigo++) {

            System.out.print("Digite o nome: ");
            nome = entrada.next();

            System.out.print("Digite a altura: ");
            altura = entrada.nextDouble();

            System.out.print("Digite o sexo (1-M / 2-F): ");
            sexo = entrada.nextInt();

            somaTurma = somaTurma + altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaior = nome;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                nomeMenor = nome;
            }

            if (sexo == 1) {
                somaHomens = somaHomens + altura;
                quantidadeHomens++;
            } else {
                somaMulheres = somaMulheres + altura;
                quantidadeMulheres++;
            }
        }

        mediaHomens = somaHomens / quantidadeHomens;
        mediaMulheres = somaMulheres / quantidadeMulheres;
        mediaTurma = somaTurma / 15;

        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Nome: " + nomeMaior);

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Nome: " + nomeMenor);

        System.out.println("Media dos homens: " + mediaHomens);
        System.out.println("Media das mulheres: " + mediaMulheres);
        System.out.println("Media da turma: " + mediaTurma);

        entrada.close();
    }

    public static void Algoritmo09() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("----------------------------");
        System.out.print("Algoritmo09");

        int n;
        double nota;
        double maiorNota = 0;
        double menorNota = 15;

        System.out.print("Digite o numero de alunos: ");
        n = entrada.nextInt();

        for (int aluno = 1; aluno <= n; aluno++) {

            System.out.print("Digite a nota: ");
            nota = entrada.nextDouble();

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);

        entrada.close();
    }

    public static void Algoritmo10() {
        System.out.print("----------------------------");
        System.out.print("Algoritmo10");

        double centimetros;

        for (int polegada = 1; polegada <= 20; polegada++) {

            centimetros = polegada * 2.54;

            System.out.println(polegada
                    + " polegadas = "
                    + centimetros
                    + " cm");
        }
    }
    public static void Algoritmo11(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("----------------------------");
        System.out.print("Algoritmo11");

        int limiteInferior;
        int limiteSuperior;
        int soma = 0;

        System.out.print("Digite o limite inferior: ");
        limiteInferior = entrada.nextInt();

        System.out.print("Digite o limite superior: ");
        limiteSuperior = entrada.nextInt();

        for (int numero = limiteInferior;
             numero <= limiteSuperior;
             numero++) {

            if (numero % 2 == 0) {
                soma = soma + numero;
            }
        }

        System.out.println("Soma dos numeros pares: " + soma);

        entrada.close();
    }
    public static void Algoritmo15(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("----------------------------");
        System.out.print("Algoritmo15");
        int matricula;
        int matriculaMaior = 0;
        int matriculaSegundaMaior = 0;

        double nota;
        double maiorNota = -1;
        double segundaMaiorNota = -1;

        for (int aluno = 1; aluno <= 100; aluno++) {

            System.out.print("Digite a matricula: ");
            matricula = entrada.nextInt();

            System.out.print("Digite a nota: ");
            nota = entrada.nextDouble();

            if (nota > maiorNota) {

                segundaMaiorNota = maiorNota;
                matriculaSegundaMaior = matriculaMaior;

                maiorNota = nota;
                matriculaMaior = matricula;

            } else if (nota > segundaMaiorNota) {

                segundaMaiorNota = nota;
                matriculaSegundaMaior = matricula;
            }
        }

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Matricula: " + matriculaMaior);

        System.out.println("Segunda maior nota: "
                + segundaMaiorNota);

        System.out.println("Matricula: "
                + matriculaSegundaMaior);

        entrada.close();
    }
}

