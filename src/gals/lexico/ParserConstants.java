package gals.lexico;

public interface ParserConstants
{
    int START_SYMBOL = 37;

    int FIRST_NON_TERMINAL    = 37;
    int FIRST_SEMANTIC_ACTION = 74;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  1, -1, -1, -1, -1, -1, -1, -1, -1,  1,  1, -1,  1,  1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  3, -1, -1, -1, -1, -1, -1, -1, -1,  3,  3, -1,  3,  3, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  4, -1, -1, -1, -1, -1, -1, -1, -1,  4,  4, -1,  4,  4, -1,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  5, -1, -1, -1, -1, -1, -1, -1, -1,  7,  6, -1,  8,  9, -1,  9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 15, 16, 16, 16, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 17, 18, 19, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, 24, 22, -1, 23, 25, -1, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 29, -1, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 33, -1, -1, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, 39, 39, -1, 39, 39, -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, 40, 40, -1, 40, 40, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 48, 48, 48, 48, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, 48, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, 48, 48, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, 51, -1, 49, 49, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 35, 35, 35, 35, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, 35, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, 35, 35, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 52, 52, 52, 52, -1, -1, -1, 54, -1, -1, -1, -1, -1, -1, 53, -1, -1, -1, 55, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, 52, 52, -1, -1 },
        { -1, 56, 56, 56, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, -1, 56, 56, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 57, 57, -1, 57, 57, -1, -1, -1, 57, -1, -1, 58, 58, 58, 58, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, 60, 61, 62, -1, -1, -1, -1 },
        { -1, 63, 63, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, -1, -1, 63, 63, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, 64, -1, 64, 64, -1, -1, -1, 64, -1, -1, 64, 64, 64, 64, 65, 66, -1, -1 },
        { -1, 67, 67, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, 67, 67, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, 68, -1, 68, 68, -1, -1, -1, 68, -1, -1, 68, 68, 68, 68, 68, 68, 69, 70 },
        { -1, 71, 72, 73, 74, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 75, -1, -1, -1, -1, -1, -1, -1, 76, 77, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 174,  10,  13,  27,  38,  28, 175 },
        {  40,  39 },
        {   0 },
        {  38 },
        {  41,  22 },
        {  44,  42 },
        {  49 },
        {  54 },
        {  53 },
        {  58 },
        {  43 },
        {  48 },
        { 201 },
        {  24,  46, 200 },
        {   2, 199,  45 },
        {  21,  44 },
        {   0 },
        {   3 },
        {   4 },
        {   5 },
        {   9 },
        {  16 },
        {  49 },
        {  53 },
        {  54 },
        {  58 },
        {  44,  23,  61 },
        {  23,  61, 202 },
        {  12,  25,  50,  26 },
        {  52,  44, 203,  51 },
        {  22,  50 },
        {   0 },
        {   5, 204,  22 },
        {   0 },
        {  14,  25,  63,  26 },
        {  61, 176,  64 },
        {  21,  63 },
        {   0 },
        {  11,  25,  61,  26, 192,  27,  55,  28,  57, 193 },
        {  47,  22,  56 },
        {  55 },
        {   0 },
        { 194,   8,  27,  55,  28 },
        {   0 },
        { 195,  59 },
        { 195,  60 },
        {  17,  25,  61,  26, 196,   7,  27,  55,  28, 197 },
        {  15,  27,  55,  28,  17,  25,  61,  26, 198 },
        {  65,  62 },
        {   0 },
        {  18,  65, 177,  62 },
        {  19,  65, 178,  62 },
        {  66 },
        {  16, 179 },
        {   9, 180 },
        {  20,  65, 181 },
        {  69,  67 },
        {   0 },
        {  68, 182,  69, 183 },
        {  29 },
        {  30 },
        {  31 },
        {  32 },
        {  71,  70 },
        {   0 },
        {  33,  71, 184,  70 },
        {  34,  71, 185,  70 },
        {  73,  72 },
        {   0 },
        {  35,  73, 186,  72 },
        {  36,  73, 187,  72 },
        {   2, 205 },
        {   3, 188 },
        {   4, 189 },
        {   5, 190 },
        {  25,  61,  26 },
        {  33,  73 },
        {  34,  73, 191 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado id",
        "Era esperado int",
        "Era esperado float",
        "Era esperado string",
        "Era esperado palavra",
        "Era esperado pr_do",
        "Era esperado pr_else",
        "Era esperado pr_false",
        "Era esperado pr_fun",
        "Era esperado pr_if",
        "Era esperado pr_in",
        "Era esperado pr_main",
        "Era esperado pr_out",
        "Era esperado pr_repeat",
        "Era esperado pr_true",
        "Era esperado pr_while",
        "Era esperado and",
        "Era esperado or",
        "Era esperado not",
        "Era esperado comma",
        "Era esperado semicolon",
        "Era esperado equal",
        "Era esperado colon",
        "Era esperado parenthesis_o",
        "Era esperado parenthesis_c",
        "Era esperado brace_o",
        "Era esperado brace_c",
        "Era esperado equity",
        "Era esperado different",
        "Era esperado minor",
        "Era esperado major",
        "Era esperado plus",
        "Era esperado minus",
        "Era esperado multiply",
        "Era esperado split",
        "<program> inv�lido",
        "<list_inst> inv�lido",
        "<list_inst_aux> inv�lido",
        "<inst> inv�lido",
        "<inst_aux> inv�lido",
        "<inst_aux1> inv�lido",
        "<declare> inv�lido",
        "<id_list> inv�lido",
        "<id_list_aux> inv�lido",
        "<valor> inv�lido",
        "<cmd> inv�lido",
        "<assign_cmd> inv�lido",
        "<in_cmd> inv�lido",
        "<in_list> inv�lido",
        "<in_list_aux> inv�lido",
        "<string_opt> inv�lido",
        "<out_cmd> inv�lido",
        "<select_cmd> inv�lido",
        "<cmd_list> inv�lido",
        "<cmd_list_aux> inv�lido",
        "<else_opt> inv�lido",
        "<loop_cmd> inv�lido",
        "<while_cmd> inv�lido",
        "<repeat_cmd> inv�lido",
        "<expression> inv�lido",
        "<expression_> inv�lido",
        "<expression_list> inv�lido",
        "<expression_list_aux> inv�lido",
        "<element> inv�lido",
        "<relational> inv�lido",
        "<relational_> inv�lido",
        "<relational_operator> inv�lido",
        "<arithmetic> inv�lido",
        "<arithmetic_> inv�lido",
        "<term> inv�lido",
        "<term_> inv�lido",
        "<factor> inv�lido"
    };
}