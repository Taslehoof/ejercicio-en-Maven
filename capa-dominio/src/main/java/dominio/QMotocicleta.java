package dominio;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QMotocicleta extends dominio.QVehiculo
{
    public static final QMotocicleta jdoCandidate = candidate("this");

    public static QMotocicleta candidate(String name)
    {
        return new QMotocicleta(null, name, 5);
    }

    public static QMotocicleta candidate()
    {
        return jdoCandidate;
    }

    public static QMotocicleta parameter(String name)
    {
        return new QMotocicleta(Motocicleta.class, name, ExpressionType.PARAMETER);
    }

    public static QMotocicleta variable(String name)
    {
        return new QMotocicleta(Motocicleta.class, name, ExpressionType.VARIABLE);
    }

    public final NumericExpression<Integer> cilindrada;
    public final NumericExpression<Integer> numeroCilindros;
    public final StringExpression tipo;

    public QMotocicleta(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.cilindrada = new NumericExpressionImpl<Integer>(this, "cilindrada");
        this.numeroCilindros = new NumericExpressionImpl<Integer>(this, "numeroCilindros");
        this.tipo = new StringExpressionImpl(this, "tipo");
    }

    public QMotocicleta(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.cilindrada = new NumericExpressionImpl<Integer>(this, "cilindrada");
        this.numeroCilindros = new NumericExpressionImpl<Integer>(this, "numeroCilindros");
        this.tipo = new StringExpressionImpl(this, "tipo");
    }
}
