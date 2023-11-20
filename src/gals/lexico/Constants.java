package gals.lexico;
public interface Constants extends ScannerConstants
{
    int EPSILON  = 0;
    int DOLLAR   = 1;

    int t_palavra_reservada = 2;
    int t_identificador_int = 3;
    int t_identificador_float = 4;
    int t_identificador_string = 5;
    int t_constante_int = 6;
    int t_constante_float = 7;
    int t_constante_string = 8;
    int t_linha = 9;
    int t_bloco = 10;

}
