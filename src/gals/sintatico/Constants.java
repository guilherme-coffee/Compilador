package gals.sintatico;

import gals.lexico.ScannerConstants;

public interface Constants extends ScannerConstants, ParserConstants {
    int EPSILON  = 0;
    int DOLLAR   = 1;

    int t_palavra_reservada = 2;
    int t_identificador_int = 3;
    int t_identificador_float = 4;
    int t_identificador_string = 5;
    int t_identificador_bool = 6;
    int t_constante_int = 7;
    int t_constante_float = 8;
    int t_constante_string = 9;
    int t_do = 10;
    int t_else = 11;
    int t_false = 12;
    int t_fun = 13;
    int t_if = 14;
    int t_in = 16;
    int t_main = 17;
    int t_out = 18;
    int t_repeat = 19;
    int t_true = 20;
    int t_while = 21;
    int t_TOKEN_28 = 28; //"{"
    int t_TOKEN_29 = 29; //"}"
    int t_TOKEN_30 = 30; //"("
    int t_TOKEN_31 = 31; //")"
    int t_TOKEN_32 = 32; //"=="
    int t_TOKEN_33 = 33; //"<>"
    int t_TOKEN_34 = 34; //"<"
    int t_TOKEN_35 = 35; //">"
    int t_TOKEN_36 = 36; //"+"
    int t_TOKEN_37 = 37; //"-"
    int t_TOKEN_38 = 38; //"*"
    int t_TOKEN_39 = 39; //"/"
    int t_TOKEN_40 = 40; //","
    int t_TOKEN_41 = 41; //";"
    int t_TOKEN_42 = 42; //":"
    int t_TOKEN_43 = 43; //"="
    int t_TOKEN_44 = 44; //"&"
    int t_TOKEN_45 = 45; //"|"
    int t_TOKEN_46 = 46; //"!"

}
