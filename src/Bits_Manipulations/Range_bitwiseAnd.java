package Bit_Manipulations;
/*Find bitwise And of all numbers in range
X and y 
For ex:x=4,y=10; find 4&5&6&7&8&9&10;*/
class Range_bitwiseAnd{
int bitwiseAnd(int x,int y)
{
int res=y;
while(y>x)
{
res=(y &( y-1));
y=res;
}

return res;
}
}
