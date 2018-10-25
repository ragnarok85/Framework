/* Generated By:JavaCC: Do not edit this line. LQMLParserTokenManager.java */
package io.github.luzzu.qml.parser;
import java.io.Reader ;
import java.io.StringReader ;
import java.util.ArrayList;
import java.util.List;
import java.util.Map ;
import java.util.HashMap ;
import io.github.luzzu.qml.datatypes.conditions.CustomCondition;
import io.github.luzzu.qml.datatypes.conditions.DefinedCondition;
import io.github.luzzu.qml.datatypes.conditions.Condition;
import io.github.luzzu.qml.datatypes.conditions.ConditionType;
import io.github.luzzu.qml.datatypes.Metric;
import io.github.luzzu.qml.datatypes.actions.ActionType;
import io.github.luzzu.qml.datatypes.actions.Action;
import io.github.luzzu.qml.datatypes.functions.Function;
import io.github.luzzu.qml.datatypes.functions.FunctionType;
import io.github.luzzu.qml.datatypes.functions.FunctionParam;
import io.github.luzzu.qml.datatypes.functions.FunctionParamType;
import io.github.luzzu.qml.datatypes.Rule;
import io.github.luzzu.qml.datatypes.RuleSet;

/** Token Manager. */
public class LQMLParserTokenManager implements LQMLParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7fffffc0L) != 0L)
         {
            jjmatchedKind = 33;
            return 25;
         }
         if ((active0 & 0x200000000000L) != 0L)
            return 13;
         if ((active0 & 0x340000000000000L) != 0L)
            return 15;
         return -1;
      case 1:
         if ((active0 & 0x7fffffc0L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 1;
            return 26;
         }
         return -1;
      case 2:
         if ((active0 & 0x8c00040L) != 0L)
            return 26;
         if ((active0 & 0x773fff80L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 2;
            return 26;
         }
         return -1;
      case 3:
         if ((active0 & 0x40000000L) != 0L)
            return 26;
         if ((active0 & 0x373fff80L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 3;
            return 26;
         }
         return -1;
      case 4:
         if ((active0 & 0x13042280L) != 0L)
            return 26;
         if ((active0 & 0x243bdd00L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 4;
            }
            return 26;
         }
         return -1;
      case 5:
         if ((active0 & 0x228c00L) != 0L)
            return 26;
         if ((active0 & 0x26195100L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 5;
            return 26;
         }
         return -1;
      case 6:
         if ((active0 & 0x26104100L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 6;
            return 26;
         }
         if ((active0 & 0x91000L) != 0L)
            return 26;
         return -1;
      case 7:
         if ((active0 & 0x26100100L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 7;
            return 26;
         }
         if ((active0 & 0x4000L) != 0L)
            return 26;
         return -1;
      case 8:
         if ((active0 & 0x22000100L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 8;
            return 26;
         }
         if ((active0 & 0x4100000L) != 0L)
            return 26;
         return -1;
      case 9:
         if ((active0 & 0x22000100L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 9;
            return 26;
         }
         return -1;
      case 10:
         if ((active0 & 0x2000100L) != 0L)
            return 26;
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 10;
            return 26;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStartNfaWithStates_0(0, 54, 15);
      case 34:
         return jjStartNfaWithStates_0(0, 45, 13);
      case 37:
         return jjMoveStringLiteralDfa1_0(0x80000000000000L);
      case 40:
         return jjStopAtPos(0, 39);
      case 41:
         return jjStopAtPos(0, 40);
      case 44:
         return jjStopAtPos(0, 41);
      case 46:
         return jjStopAtPos(0, 44);
      case 58:
         return jjStopAtPos(0, 42);
      case 59:
         return jjStopAtPos(0, 43);
      case 61:
         jjmatchedKind = 56;
         return jjMoveStringLiteralDfa1_0(0x200000000000000L);
      case 63:
         return jjMoveStringLiteralDfa1_0(0x1c00000000000000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x800a400L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x3200000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x140L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x801000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1c0000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0xa00L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x50000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x20020000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 123:
         return jjStopAtPos(0, 37);
      case 125:
         return jjStopAtPos(0, 38);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 37:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(1, 55);
         break;
      case 62:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x10410280L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x940L);
      case 103:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 111:
         if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         return jjMoveStringLiteralDfa2_0(active0, 0x27000000L);
      case 112:
         if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 59);
         break;
      case 115:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         return jjMoveStringLiteralDfa2_0(active0, 0x1c4000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40a08000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
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
      case 66:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 100:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 26);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 102:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 26);
         break;
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 110:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(2, 23, 26);
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 114:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(2, 22, 26);
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x200100L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x3000ce00L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x3000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
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
      case 82:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x20001000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x300L);
      case 101:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 26);
         return jjMoveStringLiteralDfa4_0(active0, 0x20080L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x10104400L);
      case 107:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x3002000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
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
      case 73:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 26);
         break;
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x4090000L);
      case 104:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(4, 9, 26);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 108:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(4, 7, 26);
         return jjMoveStringLiteralDfa5_0(active0, 0x20001000L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 111:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(4, 28, 26);
         return jjMoveStringLiteralDfa5_0(active0, 0x228400L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 26);
         else if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 24;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x2100000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
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
      case 84:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000L);
      case 85:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 99:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 11, 26);
         break;
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 102:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 17, 26);
         break;
      case 103:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x4001000L);
      case 109:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 26);
         break;
      case 110:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 26);
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 114:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(6, 16, 26);
         break;
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000L);
      case 107:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(6, 19, 26);
         break;
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000L);
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x20100000L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 121:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(6, 12, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x100000L);
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(7, 14, 26);
         break;
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x22000000L);
      case 115:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(8, 26, 26);
         break;
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      case 108:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(8, 20, 26);
         break;
      case 112:
         return jjMoveStringLiteralDfa9_0(active0, 0x20000000L);
      case 113:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa10_0(active0, 0x20000000L);
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x100L);
      case 117:
         return jjMoveStringLiteralDfa10_0(active0, 0x2000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(10, 25, 26);
         return jjMoveStringLiteralDfa11_0(active0, 0x20000000L);
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(10, 8, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 115:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(11, 29, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 25;
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
               case 0:
                  if ((0x5000000000000000L & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                  }
                  else if (curChar == 38)
                  {
                     if (kind > 53)
                        kind = 53;
                  }
                  else if (curChar == 33)
                     jjCheckNAdd(15);
                  else if (curChar == 61)
                     jjCheckNAdd(15);
                  else if (curChar == 34)
                     jjCheckNAdd(13);
                  if (curChar == 60)
                     jjCheckNAddTwoStates(23, 24);
                  else if (curChar == 62)
                     jjCheckNAdd(15);
                  if (curChar == 60)
                     jjCheckNAdd(15);
                  break;
               case 25:
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 12:
                  if (curChar == 34)
                     jjCheckNAdd(13);
                  break;
               case 13:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(13, 14);
                  break;
               case 14:
                  if (curChar == 34 && kind > 36)
                     kind = 36;
                  break;
               case 15:
                  if (curChar == 61 && kind > 46)
                     kind = 46;
                  break;
               case 16:
                  if (curChar == 61)
                     jjCheckNAdd(15);
                  break;
               case 17:
                  if (curChar == 33)
                     jjCheckNAdd(15);
                  break;
               case 18:
                  if ((0x5000000000000000L & l) != 0L && kind > 46)
                     kind = 46;
                  break;
               case 19:
                  if (curChar == 60)
                     jjCheckNAdd(15);
                  break;
               case 20:
                  if (curChar == 62)
                     jjCheckNAdd(15);
                  break;
               case 21:
                  if (curChar == 38 && kind > 53)
                     kind = 53;
                  break;
               case 22:
                  if (curChar == 60)
                     jjCheckNAddTwoStates(23, 24);
                  break;
               case 23:
                  if ((0xaffffffa00000000L & l) != 0L)
                     jjCheckNAddTwoStates(23, 24);
                  break;
               case 24:
                  if (curChar == 62 && kind > 61)
                     kind = 61;
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
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAddTwoStates(1, 3);
                  }
                  else if (curChar == 124)
                  {
                     if (kind > 53)
                        kind = 53;
                  }
                  if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 25:
               case 3:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAddStates(0, 2);
                  break;
               case 26:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAddStates(0, 2);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 4:
                  if (curChar == 69 && kind > 34)
                     kind = 34;
                  break;
               case 5:
                  if (curChar == 85)
                     jjCheckNAdd(4);
                  break;
               case 6:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 83)
                     jjCheckNAdd(4);
                  break;
               case 9:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 13:
                  jjAddStates(3, 4);
                  break;
               case 21:
                  if (curChar == 124 && kind > 53)
                     kind = 53;
                  break;
               case 23:
                  if ((0xc7fffffeafffffffL & l) != 0L)
                     jjAddStates(5, 6);
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
               case 13:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 4);
                  break;
               case 23:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(5, 6);
                  break;
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
      if ((i = jjnewStateCnt) == (startsAt = 25 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   1, 2, 3, 13, 14, 23, 24, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\144\145\146", "\154\141\142\145\154", 
"\144\145\163\143\162\151\160\164\151\157\156", "\155\141\164\143\150", "\141\143\164\151\157\156", 
"\155\145\164\162\151\143", "\146\151\156\141\154\154\171", "\141\147\145\156\164", 
"\145\163\164\151\155\141\164\145", "\141\165\164\150\157\162", "\160\141\143\153\141\147\145", 
"\164\171\160\145\157\146", "\151\163\125\122\111", "\151\163\102\154\141\156\153", 
"\151\163\114\151\164\145\162\141\154", "\143\165\163\164\157\155", "\166\141\162", "\146\165\156", 
"\143\157\165\156\164", "\143\157\165\156\164\125\156\151\161\165\145", 
"\156\157\162\155\141\154\151\163\145", "\141\144\144", "\162\141\164\151\157", 
"\164\157\164\141\154\124\162\151\160\154\145\163", "\162\165\154\145", null, null, null, null, null, null, "\173", "\175", "\50", 
"\51", "\54", "\72", "\73", "\56", "\42", null, null, null, null, null, null, null, 
null, "\41", "\45\45", "\75", "\75\76", "\77\163", "\77\160", "\77\157", null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3fe07ff67fffffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[25];
private final int[] jjstateSet = new int[50];
protected char curChar;
/** Constructor. */
public LQMLParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public LQMLParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 25; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
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

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
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
      while (curChar <= 35 && (0x900002600L & (1L << curChar)) != 0L)
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

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}