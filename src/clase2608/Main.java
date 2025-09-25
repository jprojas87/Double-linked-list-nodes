package clase2608;

import bagsqeuesstacks.colas_est_dat.colas_est_datos.Queue;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static int jerarquia(String operador){
        return switch (operador){
            case "+", "-" -> 1;
            case "*", "/", "%" -> 2;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        var queueEntry = new Queue<String>();
        var queueExit = new Queue<String>();
        var pila = new Stack<String>();
        var pilaResultado = new Stack<Integer>();
        var sc = new Scanner(System.in);
        System.out.print("Ingrese la operación con espacios entre operandos y operadores:");
        var cadena = sc.nextLine();
        String[] cadenaSeparada = cadena.split(" ");
        for (String dato : cadenaSeparada) {
            queueEntry.enqueue(dato);
        }
        //System.out.println(queueEntry.toString());

        while (!queueEntry.isEmpty()) {
            String token = queueEntry.dequeue();
            if (token.matches("\\d+")) {
                queueExit.enqueue(token);
            } else {
                while (!pila.isEmpty() && jerarquia(token) <= jerarquia(pila.peek())) {
                    queueExit.enqueue(pila.pop());
                }
                pila.push(token);
            }
        }

        /*
        while (!queueEntry.isEmpty()) {
        String token = queueEntry.dequeue();
            if (token.matches("\\d+")) {
                queueExit.enqueue(token);
                continue;
            }
            if (pila.isEmpty()){
                pila.push(token);
                continue;
            }
            // !pila.isEmpty redundante
            if (jerarquia(token) > jerarquia(pila.peek())){
                pila.push(token);
                continue;
            }
            if (!pila.isEmpty() && jerarquia(token) <= jerarquia(pila.peek())){
                queueExit.enqueue(token);
            }
        }
         */

        while (!pila.isEmpty()){
            queueExit.enqueue(pila.pop());
        }
        System.out.println(queueExit.toString());

        while (!queueExit.isEmpty()){
            String token = queueExit.dequeue();
            if (token.matches("\\d+")) {
                var operandos = Integer.parseInt(token);
                pilaResultado.push(operandos);
                continue;
            } else {
                int y = pilaResultado.pop();
                int x = pilaResultado.pop();
                var r = switch (token) {
                    case "+" -> x + y;
                    case "-" -> x - y;
                    case "*" -> x * y;
                    case "/" -> x / y;
                    case "%" -> x % y;
                    default -> throw new IllegalArgumentException("Operador inválido: " + token);
                };
                pilaResultado.push(r);
            }
        }
        System.out.println("Resultado final: " + pilaResultado.pop());
    }
    //25 + 100 * 30

}



