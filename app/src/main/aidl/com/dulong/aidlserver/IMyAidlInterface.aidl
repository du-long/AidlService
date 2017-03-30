package com.dulong.aidlserver;
import com.dulong.aidlserver.Person;

interface IMyAidlInterface {
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString);
   int add (int a,int b);
   void setPerson(in Person person);
}
