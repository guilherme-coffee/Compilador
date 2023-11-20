package gals.sintatico;

public interface ParserConstants
{
    int START_SYMBOL = 44;

    int FIRST_NON_TERMINAL    = 44;
    int FIRST_SEMANTIC_ACTION = 83;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1,  1,  1,  1,  1, -1, -1, -1, -1, -1, -1, -1, -1,  1,  1, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  2, -1 },
        { -1, -1,  3,  3,  3,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  5,  4, -1, -1 },
        { -1, -1,  6,  7,  8,  9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 10, -1, -1 },
        { -1, -1, 12, 12, 12, 12, -1, -1, -1, -1, -1, -1, -1, -1, 12, 12, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 14, 14, 14, 14, -1, -1, -1, -1, 13, 13, -1, 13, 14, 14, 13, -1, -1, -1, -1, 14, -1, -1, -1, -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 15, 15, 15, 15, -1, -1, -1, -1, -1, -1, -1, -1, 18, 16, -1, -1, -1, -1, -1, 17, -1, -1, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 20, 20, 20, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22 },
        { -1, -1, 23, 23, 23, 23, -1, -1, -1, -1, 23, 23, -1, 23, 23, 23, 23, -1, -1, -1, -1, 23, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 24, -1 },
        { -1, -1, 25, 26, 27, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 31, 31, 31, 31, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 32, 32, 32, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1 },
        { -1, -1, 35, 35, 35, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 39, 39, 39, 39, 39, 39, 39, -1, -1, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, 39, -1, 39, 39, -1, -1, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 48, 48, 48, 48, 48, 48, 48, -1, -1, -1, 48, -1, -1, -1, -1, -1, 48, 48, -1, -1, 48, -1, 48, 48, -1, -1, -1, 48, -1, -1, -1, -1, -1, 48, 48, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 49, 49, 49, 49, -1, -1, -1, 50, 49, 49, -1, 49, 49, 49, 49, 49, -1, -1, 51, 49, -1, -1, -1, -1, 49, -1, 49, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, 49, -1 },
        { -1, -1, 52, 52, 52, 52, 52, 52, 52, -1, -1, -1, 54, -1, -1, -1, -1, -1, 52, 55, -1, -1, 52, -1, 52, 53, -1, -1, -1, 52, -1, -1, -1, -1, -1, 52, 52, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 56, 56, 56, 56, 56, 56, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, 56, -1, 56, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, 56, 56, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 57, 57, 57, 57, -1, -1, -1, 57, 57, 57, -1, 57, 57, 57, 57, 57, -1, -1, 57, 57, -1, -1, -1, -1, 57, -1, 57, -1, 57, 58, 58, 58, 58, -1, -1, -1, -1, 57, -1, 57, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 60, 61, 62, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 63, 63, 63, 63, 63, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, 63, -1, 63, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, 63, 63, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 64, 64, 64, 64, -1, -1, -1, 64, 64, 64, -1, 64, 64, 64, 64, 64, -1, -1, 64, 64, -1, -1, -1, -1, 64, -1, 64, -1, 64, 64, 64, 64, 64, 65, 66, -1, -1, 64, -1, 64, -1 },
        { -1, -1, 67, 67, 67, 67, 67, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, 67, -1, 67, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, 67, 67, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 68, 68, 68, 68, -1, -1, -1, 68, 68, 68, -1, 68, 68, 68, 68, 68, -1, -1, 68, 68, -1, -1, -1, -1, 68, -1, 68, -1, 68, 68, 68, 68, 68, 68, 68, 69, 70, 68, -1, 68, -1 },
        { -1, -1, 71, 71, 71, 71, 72, 73, 74, -1, -1, -1, -1, -1, -1, -1, -1, -1, 75, -1, -1, -1, 76, -1, 77, -1, -1, -1, -1, 78, -1, -1, -1, -1, -1, 79, 80, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 81, 81, 81, 81, -1, -1, -1, 81, 81, 81, -1, 81, 81, 81, 81, 81, -1, -1, 81, 81, -1, -1, -1, -1, 81, 82, 81, -1, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81, -1, 81, -1 },
        { -1, -1, 83, 84, 85, 86, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
        {
            {  98,  24,  45,  50,  14,  99 },
            {   0 },
            {  42,  46, 106,  41 },
            {  48,  47 },
            {   0 },
            {  40,  46 },
            {   3, 107,  49 },
            {   4, 107,  49 },
            {   5, 107,  49 },
            {   6, 107,  49 },
            {   0 },
            {  28,   7,  29 },
            {  52,  51 },
            {   0 },
            {  50 },
            {  53 },
            {  57 },
            {  63 },
            {  66 },
            {  68 },
            {  56, 107,  54, 108 },
            {  28,  70,  29,  43,  70,  55 },
            {  43,  70,  55 },
            {   0 },
            {  42,  15,  70, 109 },
            {   3 },
            {   4 },
            {   5 },
            {   6 },
            {  16,  30,  58 },
            {   9, 100,  97,  40,  59, 110,  31 },
            {  59, 110,  31 },
            {  61,  60 },
            {   0 },
            {  40,  59 },
            {  56, 107,  62 },
            {   0 },
            {  28,  70,  29 },
            {  22,  30,  64,  31 },
            {  70,  97,  65 },
            {   0 },
            {  40,  64 },
            {  15,  70, 111,  18,  50,  67,  11, 112 },
            {  17, 113,  50 },
            {   0 },
            {  27, 114,  70,  69, 116 },
            {  18, 115,  50,  12 },
            {  17, 115,  50,  12 },
            {  72,  71 },
            {   0 },
            {  10,  72, 104,  71 },
            {  21,  72, 105,  71 },
            {  73 },
            {  26,  94 },
            {  13,  95 },
            {  20,  72,  96 },
            {  76,  74 },
            {   0 },
            {  75,  92,  76,  93 },
            {  32 },
            {  33 },
            {  34 },
            {  35 },
            {  78,  77 },
            {   0 },
            {  36,  78,  84,  77 },
            {  37,  78,  85,  77 },
            {  80,  79 },
            {   0 },
            {  38,  80,  86,  79 },
            {  39,  80,  87,  79 },
            {  82, 117,  81 },
            {   7,  88 },
            {   8,  89 },
            {   9, 100 },
            {  19, 101 },
            {  23, 102 },
            {  25, 103 },
            {  30,  70,  31 },
            {  36,  80,  90 },
            {  37,  80,  91 },
            {   0 },
            {  28,  70,  29 },
            {   3 },
            {   4 },
            {   5 },
            {   6 }
        };

    String[] PARSER_ERROR =
    {
    	"",    // "",
    	"esperado EOF",    // "Era esperado fim de programa",
    	"esperado palavra_reservada",    // "Era esperado palavra_reservada",
    	"esperado identificador",    // "Era esperado identificador_int",
    	"esperado identificador",    // "Era esperado identificador_float",
    	"esperado identificador",    // "Era esperado identificador_string",
    	"esperado identificador",    // "Era esperado identificador_bool",
    	"esperado constante_int",    // "Era esperado constante_int",
    	"esperado constante_float",    // "Era esperado constante_float",
    	"esperado constante_string",    // "Era esperado constante_string",
    	"esperado false",    // "Era esperado false",
    	"esperado if",    // "Era esperado if",
    	"esperado in",    // "Era esperado in",
    	"esperado out",    // "Era esperado out",
    	"esperado true",    // "Era esperado true",
    	"esperado while",    // "Era esperado while",
    	"esperado do",    // "Era esperado do",
    	"esperado fun",    // "Era esperado fun",
    	"esperado main",    // "Era esperado main",
    	"esperado repeat",    // "Era esperado repeat",
    	"esperado \"{\"",    // "Era esperado \"{\"",
    	"esperado \"}\"",    // "Era esperado \"}\"",
    	"esperado \"(\"",    // "Era esperado \"(\"",
    	"esperado \")\"",    // "Era esperado \")\"",
    	"esperado \"==\"",    // "Era esperado \"==\"",
    	"esperado \"<>\"",    // "Era esperado \"<>\"",
    	"esperado \"<\"",    // "Era esperado \"<\"",
    	"esperado \">\"",    // "Era esperado \">\"",
    	"esperado \"+\"",    // "Era esperado \"+\"",
    	"esperado \"-\"",    // "Era esperado \"-\"",
    	"esperado \"*\"",    // "Era esperado \"*\"",
    	"esperado \"/\"",    // "Era esperado \"/\"",
    	"esperado \",\"",    // "Era esperado \",\"",
    	"esperado \";\"",    // "Era esperado \";\"",
    	"esperado \":\"",    // "Era esperado \":\"",
    	"esperado \"=\"",    // "Era esperado \"=\"",
    	"esperado \"!\"",    // "Era esperado \"!\"",
    	"esperado \"&\"",    // "Era esperado \"&\"",
    	"esperado \"|\"",    // "Era esperado \"|\"",
    	"esperado start",    // "<programa> inv�lido",
    	"esperado identificador if in out while :",    // "<declaracao_variaveis> inv�lido",
    	"esperado identificador",    // "<lista_identificadores> inv�lido",
    	"esperado , ;",    // "<lista_identificadores2> inv�lido",
    	"esperado identificador",    // "<identificador> inv�lido",
    	"esperado [ , ;",    // "<array_opcional> inv�lido",
    	"esperado identificador if in out while",    // "<lista_comandos> inv�lido",
    	"esperado identificador main fun true else if in do out while repeat ",    // "<lista_comandos2> inv�lido",
    	"esperado identificador if in out while",    // "<comando> inv�lido",
    	"esperado identificador",    // "<comando_atribuicao> inv�lido",
    	"esperado [ =",    // "<comando_atribuicao2> inv�lido",
    	"esperado identificador main fun true else if in do out while repeat :",    // "<sufixo> inv�lido",
    	"esperado identificador",    // "<outro_identificador> inv�lido",
    	"esperado in",    // "<comando_entrada> inv�lido",
    	"esperado identificador  constante string",    // "<comando_entrada2> inv�lido",
    	"esperado identificador ",    // "<lista_variaveis> inv�lido",
    	"esperado ) ,",    // "<lista_variaveis2> inv�lido",
    	"esperado identificador",    // "<variavel> inv�lido",
    	"esperado [ ) ,",    // "<variavel2> inv�lido",
    	"esperado out ",    // "<comando_saida> inv�lido",
    	"esperado uma expressao",    // "<lista_expressoes> inv�lido",
    	"esperado ) ,",    // "<lista_expressoes2> inv�lido",
    	"esperado if",    // "<comando_selecao> inv�lido",
    	"esperado endIf isFalseDo",    // "<senao> inv�lido",
    	"esperado while",    // "<comando_repeticao> inv�lido",
    	"esperado isFalseDo isTrueDo",    // "<comando_repeticao2> inv�lido",
    	"esperado uma expressao",    // "<expressao> inv�lido",
    	"esperado uma expressao",    // "<expressao2> inv�lido",
    	"esperado uma expressao",    // "<elemento> inv�lido",
    	"esperado uma expressao",    // "<relacional> inv�lido",
    	"esperado uma expressao",    // "<relacional2> inv�lido",
    	"esperado == <> < >",    // "<operador_relacional> inv�lido",
    	"esperado uma expressao",    // "<aritmetica> inv�lido",
    	"esperado uma expressao",    // "<aritmetica2> inv�lido",
    	"esperado uma expressao",    // "<termo> inv�lido",
    	"esperado uma expressao",    // "<termo2> inv�lido",
    	"esperado uma expressao",    // "<fator> inv�lido",
    	"esperado uma expressao",    // "<fator2> inv�lido",
    	"esperado identificador",   // "<identificador_fator> inv�lido"
    };
}