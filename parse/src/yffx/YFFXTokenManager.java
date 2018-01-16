/* Generated By:JJTree&JavaCC: Do not edit this line. YFFXTokenManager.java */
package yffx;
import java.io.*;

/** Token Manager. */
public class YFFXTokenManager implements YFFXConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x4000L) != 0L)
            return 2;
         if ((active0 & 0x1fb800L) != 0L)
         {
            jjmatchedKind = 21;
            return 8;
         }
         return -1;
      case 1:
         if ((active0 & 0x148000L) != 0L)
            return 8;
         if ((active0 & 0xb3800L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 21;
               jjmatchedPos = 1;
            }
            return 8;
         }
         return -1;
      case 2:
         if ((active0 & 0x20000L) != 0L)
            return 8;
         if ((active0 & 0xd3800L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 2;
            return 8;
         }
         return -1;
      case 3:
         if ((active0 & 0x11800L) != 0L)
            return 8;
         if ((active0 & 0xc2000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 3;
            return 8;
         }
         return -1;
      case 4:
         if ((active0 & 0x82000L) != 0L)
            return 8;
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 4;
            return 8;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 37:
         return jjStopAtPos(0, 38);
      case 40:
         return jjStopAtPos(0, 30);
      case 41:
         return jjStopAtPos(0, 31);
      case 42:
         return jjStopAtPos(0, 7);
      case 43:
         return jjStopAtPos(0, 5);
      case 44:
         return jjStopAtPos(0, 37);
      case 45:
         return jjStopAtPos(0, 6);
      case 47:
         return jjStopAtPos(0, 8);
      case 59:
         return jjStopAtPos(0, 36);
      case 61:
         return jjStartNfaWithStates_0(0, 14, 2);
      case 91:
         return jjStopAtPos(0, 32);
      case 93:
         return jjStopAtPos(0, 33);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x140000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x28000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 123:
         return jjStopAtPos(0, 34);
      case 125:
         return jjStopAtPos(0, 35);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 102:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 8);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x90000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 111:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x41000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x3800L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 116:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 17, 8);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 100:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 8);
         break;
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 8);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 110:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 8);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 9;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 9)
                        kind = 9;
                     jjCheckNAdd(0);
                  }
                  else if ((0x5000000000000000L & l) != 0L)
                  {
                     if (kind > 23)
                        kind = 23;
                  }
                  else if (curChar == 33)
                     jjCheckNAdd(2);
                  else if (curChar == 61)
                     jjCheckNAdd(2);
                  if (curChar == 60)
                     jjCheckNAdd(2);
                  else if (curChar == 62)
                     jjCheckNAdd(2);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 9)
                     kind = 9;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if (curChar == 61 && kind > 23)
                     kind = 23;
                  break;
               case 3:
                  if (curChar == 62)
                     jjCheckNAdd(2);
                  break;
               case 4:
                  if (curChar == 60)
                     jjCheckNAdd(2);
                  break;
               case 5:
                  if (curChar == 61)
                     jjCheckNAdd(2);
                  break;
               case 6:
                  if (curChar == 33)
                     jjCheckNAdd(2);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 8:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(8);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 9 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\55", "\52", "\57", null, null, 
"\155\141\151\156", "\166\157\151\144", "\167\150\151\154\145", "\75", "\151\146", 
"\145\154\163\145", "\151\156\164", "\144\157\165\142\154\145", "\146\154\157\141\164", 
"\144\157", null, null, null, null, null, null, null, null, null, "\50", "\51", "\133", 
"\135", "\173", "\175", "\73", "\54", "\45", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fc0fffbe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[9];
static private final int[] jjstateSet = new int[18];
static protected char curChar;
/** Constructor. */
public YFFXTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public YFFXTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 9; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
