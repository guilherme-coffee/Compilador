package gals.lexico;
public interface Constants extends ScannerConstants, ParserConstants
{
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
    int t_linha = 10;
    int t_bloco = 11;
    int t_pr_do = 12;
    int t_pr_else = 13;
    int t_pr_false = 14;
    int t_pr_fun = 15;
    int t_pr_if = 16;
    int t_pr_in = 17;
    int t_pr_main = 18;
    int t_pr_out = 19;
    int t_pr_repeat = 20;
    int t_pr_true = 21;
    int t_pr_while = 22;
    int t_and = 23;
    int t_or = 24;
    int t_not = 25;
    int t_comma = 26;
    int t_semicolon = 27;
    int t_equal = 28;
    int t_colon = 29;
    int t_parenthesis_o = 30;
    int t_parenthesis_c = 31;
    int t_brace_o = 32;
    int t_brace_c = 33;
    int t_equity = 34;
    int t_different = 35;
    int t_minor = 36;
    int t_major = 37;
    int t_plus = 38;
    int t_minus = 39;
    int t_multiply = 40;
    int t_split = 41;

}

