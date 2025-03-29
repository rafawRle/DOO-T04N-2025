# Paradigmas de Programação: Imperativo e Declarativo

A programação pode ser dividida em diferentes paradigmas, sendo os mais comuns o **imperativo** e o **declarativo**. Cada paradigma possui suas próprias características e abordagens para resolver problemas computacionais.

## Paradigma Imperativo

O paradigma imperativo baseia-se na descrição passo a passo de como um programa deve ser executado. Esse paradigma utiliza comandos sequenciais, estruturas de controle de fluxo (como loops e condicionais) e variáveis mutáveis para alterar o estado do programa. Linguagens como **Java, C e Python** são exemplos de linguagens que seguem esse paradigma.

### Exemplo em Java

```java
public class Fatorial {
    public static int calcularFatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println(calcularFatorial(5));
    }
}
```

No exemplo acima, a função `calcularFatorial` itera de `1` até `n`, multiplicando os valores sucessivamente para obter o fatorial. O controle de fluxo e a mutabilidade da variável `resultado` são características marcantes do paradigma imperativo.

## Paradigma Declarativo

O paradigma declarativo, por outro lado, foca na **descrição do que deve ser feito**, em vez de como fazer. Ele evita alterar estados e usa expressões matemáticas e lógica formal. Linguagens como **SQL, Haskell e Prolog** seguem esse paradigma.

### Exemplo em Prolog

```prolog
fatorial(0,1).
fatorial(N,F) :- N > 0, N1 is N - 1, fatorial(N1, F1), F is N * F1.

?- fatorial(5, X).
```

No código acima, a definição do fatorial é feita recursivamente. O primeiro fato (`fatorial(0,1).`) estabelece a base da recursão. A segunda regra define que o fatorial de `N` é obtido chamando `fatorial(N-1)`, multiplicando o resultado pelo valor de `N`. A consulta `?- fatorial(5, X).` busca o valor do fatorial de 5, retornando `X = 120`.

## Comparação entre os Paradigmas

| Característica       | Java (Imperativo) | Prolog (Declarativo) |
|----------------------|------------------|----------------------|
| Estilo de Programação | Passo a passo   | Baseado em regras e lógica |
| Controle de fluxo    | Laços e variáveis | Recursão e unificação |
| Estado Mutável       | Sim               | Não |
| Abordagem            | Como fazer        | O que fazer |

Enquanto o código Java segue um fluxo de execução bem definido com laços e manipulação de variáveis, o código Prolog define uma relação lógica entre os valores, deixando a interpretação para o motor de inferência da linguagem.

## Conclusão

Os paradigmas imperativo e declarativo representam abordagens distintas para resolver problemas computacionais. O paradigma imperativo é mais intuitivo para quem pensa em termos de etapas sequenciais, enquanto o paradigma declarativo permite uma maior abstração ao descrever apenas o que se deseja calcular. A escolha entre os dois depende do problema e do contexto de aplicação.

