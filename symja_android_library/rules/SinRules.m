{
Sin(Undefined)=Undefined,
Sin(0)=0,
Sin(1/12*Pi)=(-1+Sqrt(3))/(2*Sqrt(2)),
Sin(1/10*Pi)=1/4*(Sqrt(5)-1),
Sin(1/8*Pi)=1/2*Sqrt(2-Sqrt(2)),
Sin(1/6*Pi)=1/2,
Sin(1/5*Pi)=1/2*Sqrt((5-Sqrt(5))/2),
Sin(1/4*Pi)=Sqrt(2)/2,
Sin(3/10*Pi)=1/4*(Sqrt(5)+1),
Sin(1/3*Pi)=Sqrt(3)/2,
Sin(3/8*Pi)=1/2*Sqrt(2+Sqrt(2)),
Sin(2/5*Pi)=1/2*Sqrt((5+Sqrt(5))/2),
Sin(5/12*Pi)=(1+Sqrt(3))/(2*Sqrt(2)),
Sin(1/2*Pi)=1,
Sin(7/12*Pi)=(1+Sqrt(3))/(2*Sqrt(2)),
Sin(3/5*Pi)=1/2*Sqrt((5+Sqrt(5))/2),
Sin(5/8*Pi)=1/2*Sqrt(2+Sqrt(2)),
Sin(2/3*Pi)=Sqrt(3)/2,
Sin(7/10*Pi)=1/4*(Sqrt(5)+1),
Sin(3/4*Pi)=Sqrt(2)/2,
Sin(4/5*Pi)=1/2*Sqrt((5-Sqrt(5))/2),
Sin(5/6*Pi)=1/2,
Sin(7/8*Pi)=1/2*Sqrt(2-Sqrt(2)),
Sin(9/10*Pi)=1/4*(Sqrt(5)-1),
Sin(11/12*Pi)=(-1+Sqrt(3))/(2*Sqrt(2)),
Sin(Pi)=0,
Sin(13/12*Pi)=-(-1+Sqrt(3))/(2*Sqrt(2)),
Sin(11/10*Pi)=-1/4*(Sqrt(5)-1),
Sin(9/8*Pi)=-1/2*Sqrt(2-Sqrt(2)),
Sin(7/6*Pi)=-1/2,
Sin(6/5*Pi)=-1/2*Sqrt((5-Sqrt(5))/2),
Sin(5/4*Pi)=-Sqrt(2)/2,
Sin(13/10*Pi)=-1/4*(Sqrt(5)+1),
Sin(4/3*Pi)=-Sqrt(3)/2,
Sin(11/8*Pi)=-1/2*Sqrt(2+Sqrt(2)),
Sin(7/5*Pi)=-1/2*Sqrt((5+Sqrt(5))/2),
Sin(17/12*Pi)=-(1+Sqrt(3))/(2*Sqrt(2)),
Sin(3/2*Pi)=-1,
Sin(19/12*Pi)=-(1+Sqrt(3))/(2*Sqrt(2)),
Sin(8/5*Pi)=-1/2*Sqrt((5+Sqrt(5))/2),
Sin(13/8*Pi)=-1/2*Sqrt(2+Sqrt(2)),
Sin(5/3*Pi)=-Sqrt(3)/2,
Sin(17/10*Pi)=-1/4*(Sqrt(5)+1),
Sin(7/4*Pi)=-Sqrt(2)/2,
Sin(9/5*Pi)=-1/2*Sqrt((5-Sqrt(5))/2),
Sin(11/6*Pi)=-1/2,
Sin(15/8*Pi)=-1/2*Sqrt(2-Sqrt(2)),
Sin(19/10*Pi)=-1/4*(Sqrt(5)-1),
Sin(23/12*Pi)=-(-1+Sqrt(3))/(2*Sqrt(2)),
Sin(2*Pi)=0,

Sin(I)=I*Sinh(1), 
Sin(x_?NumberQ*Pi):=If(x<1, Sin((1-x)*Pi),If(x<2,-Sin((2-x)*Pi), Sin((x-2*Quotient(IntegerPart(x),2))*Pi) ) ) /; x>=1/2,

Sin(ArcSin(x_)):=x,
Sin(2*ArcSin(x_)):=2*x*(1-x)^(1/2)*(1+x)^(1/2),
Sin(ArcCos(x_)):=(1-x^2)^(1/2),
Sin(2*ArcCos(x_)):=2*x*(1-x)^(1/2)*(1+x)^(1/2),
Sin(ArcTan(x_)):=x*(1+x^2)^(-1/2),
Sin(2*ArcTan(x_)):=2*x*(1+x^2)^(-1),
Sin(ArcCot(x_)):=(1+x^2)^(-1/2),
Sin(2*ArcCot(x_)):=2*x*(1+x^2)^(-1),
Sin(ArcCsc(x_)):=x^(-1),
Sin(ArcSec(x_)):=(1-x^(-2))^(1/2),

Sin(I*Infinity)=I*Infinity,
Sin(-I*Infinity)=-I*Infinity,
Sin(ComplexInfinity)=Indeterminate,

Sin(Infinity)=Interval({-1,1}),
Sin(-Infinity)=Interval({-1,1}) 

}