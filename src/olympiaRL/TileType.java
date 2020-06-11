package olympiaRL;

public enum TileType {
    VOID(0, 0),
    SYMBOL_FACE(0, 8),
    SYMBOL_FACE_ALT(0, 16),
    SYMBOL_HEART(0, 24),
    SYMBOL_DIAMOND(0, 32),
    SYMBOL_CLUB(0, 40),
    SYMBOL_SPADE(0, 48),
    SYMBOL_DOT(0, 56),
    SYMBOL_DOT_INVERT(0, 64),
    SYMBOL_CIRCLE(0, 72),
    SYMBOL_CIRCLE_FILLED_IN(0, 80),
    SYMBOL_MALE(0, 88),
    SYMBOL_FEMALE(0, 96),
    MUSIC_ONE(0, 104),
    MUSIC_TWO(0, 112),
    SYMBOL_STAR(0, 120),
    ARROW_RIGHT(8, 0),
    ARROW_LEFT(8, 8),
    ARROW_UP_DOWN(8, 16),
    SYMBOL_DOUBLE_EXCLAIMATION(8, 24),
    SYMBOL_HECK(8, 32), //TODO: Figure out the name
    SYMBOL_SWIRL(8, 40),
    HALF_FILL(8, 48),
    ARROW_UP_DOWN_ALT(8, 56),
    LINE_ARROW_UP(8, 64),
    LINE_ARROW_DOWN(8, 72),
    LINE_ARROW_RIGHT(8, 80),
    LINE_ARROW_LEFT(8, 88),
    ROAD_LEFT_UP(8, 96),
    ARROW_LEFT_RIGHT(8, 104),
    ARROW_UP(8, 112),
    ARROW_DOWN(8, 120),
    VOID_ALT(16, 0),
    EXCLAMATION_POINT(16, 8),
    QUOTE(16, 16),
    HASH(16, 24),
    DOLLAR_SIGN(16, 32),
    PERCENT_SIGN(16, 40),
    AND(16, 48),
    QUOTE_SINGLE_OPEN(16, 56),
    PARENTHESES_OPEN(16, 64),
    PARENTTHESE_CLOSE(16, 72),
    ASTERISK(16, 80),
    PLUS(16, 88),
    COMMA(16, 96),
    MINUS(16, 104),
    PERIOD(16, 112),
    SLASH_FORWARD(16, 120),
    NUM_ZERO(24, 0),
    NUM_ONE(24, 8),
    NUM_TWO(24, 16),
    NUM_THREE(24, 24),
    NUM_FOUR(24, 32),
    NUM_FIVE(24, 40),
    NUM_SIX(24, 48),
    NUM_SEVEN(24, 56),
    NUM_EIGHT(24, 64),
    NUM_NINE(24, 72),
    COLON(24, 80),
    SEMICOLON(24, 88),
    LESS_THAN(24, 96),
    EQUALS(24, 104),
    GREATER_THAN(24, 112),
    QUESTION_MARK(24, 120),
    AT_SYMBOL(32, 0),
    A(32, 8),
    B(32, 16),
    C(32, 24),
    D(32, 32),
    E(32, 40),
    F(32, 48),
    G(32, 56),
    H(32, 64),
    I(32, 72),
    J(32, 80),
    K(32, 88),
    L(32, 96),
    M(32, 104),
    N(32, 112),
    O(32, 120),
    P(40, 0),
    Q(40, 8),
    R(40, 16),
    S(40, 24),
    T(40, 32),
    U(40, 40),
    V(40, 48),
    W(40, 56),
    X(40, 64),
    Y(40, 72),
    Z(40, 80),
    BRACKET_LEFT(40, 88),
    SLASH_BACK(40, 96),
    BRACKET_RIGHT(40, 104),
    EXPONENT(40, 112),
    UNDERSCORE(40, 120),
    QUOTE_SINGLE_CLOSE(48, 0),
    A_LOWER(48, 8),
    B_LOWER(48, 16),
    C_LOWER(48, 24),
    D_LOWER(48, 32),
    E_LOWER(48, 40),
    F_LOWER(48, 48),
    G_LOWER(48, 56),
    H_LOWER(48, 64),
    I_LOWER(48, 72),
    J_LOWER(48, 80),
    K_LOWER(48, 88),
    L_LOWER(48, 96),
    M_LOWER(48, 104),
    N_LOWER(48, 112),
    O_LOWER(48, 120),
    P_LOWER(56, 0),
    Q_LOWER(56, 8),
    R_LOWER(56, 16),
    S_LOWER(56, 24),
    T_LOWER(56, 32),
    U_LOWER(56, 40),
    V_LOWER(56, 48),
    W_LOWER(56, 56),
    X_LOWER(56, 64),
    Y_LOWER(56, 72),
    Z_LOWER(56, 80),
    CURLY_OPEN(56, 88),
    COLON_BOLD(56, 96),
    CURLY_CLOSE(56, 104),
    TILDY(56, 112),
    HOUSE(56, 120),
    C_OGONEK(64, 0),
    U_LOWER_ACUTE_DOUBLE(64, 8),



    DOTS_STAGGERED(88, 0);

    private int xStart, yStart;

    TileType(int xStart, int yStart) {
        this.xStart = xStart;
        this.yStart = yStart;
    }

    public int getxStart() {
        return xStart;
    }

    public int getyStart() {
        return yStart;
    }

}