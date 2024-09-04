grammar TrigExpr;

options {
    language = Java;
}

@header {
    import java.util.HashMap;
    import java.util.Map;
}

@members {
    Map<String, Double> variables = new HashMap<>();
}

start: expression* EOF;

expression: function | assignment;

function: ID '(' NUMBER ')' {
    String functionName = $ID.text.toLowerCase(); // Convierte a minúsculas
    double argument = Double.parseDouble($NUMBER.text);
    double result = 0.0;

    switch (functionName) {
        case "sin":
            result = Math.sin(Math.toRadians(argument));
            break;
        case "cos":
            result = Math.cos(Math.toRadians(argument));
            break;
        case "tan":
            result = Math.tan(Math.toRadians(argument));
            break;
        default:
            System.err.println("Función desconocida: " + $ID.text);
    }

    System.out.println(functionName + "(" + argument + ") = " + result);
};


assignment: ID '=' NUMBER {
    String variableName = $ID.text;
    double value = Double.parseDouble($NUMBER.text);
    variables.put(variableName, value);
};

ID: [a-zA-Z]+;
NUMBER: '-'? (DIGIT+ ('.' DIGIT*)? | '.' DIGIT+);
WS: [ \t\r\n]+ -> skip;
fragment DIGIT: [0-9];
