package dominio;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QUbicacion extends PersistableExpressionImpl<Ubicacion> implements PersistableExpression<Ubicacion>
{
    public static final QUbicacion jdoCandidate = candidate("this");

    public static QUbicacion candidate(String name)
    {
        return new QUbicacion(null, name, 5);
    }

    public static QUbicacion candidate()
    {
        return jdoCandidate;
    }

    public static QUbicacion parameter(String name)
    {
        return new QUbicacion(Ubicacion.class, name, ExpressionType.PARAMETER);
    }

    public static QUbicacion variable(String name)
    {
        return new QUbicacion(Ubicacion.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression domicilio;
    public final NumericExpression<Integer> numero;
    public final StringExpression telefono;
    public final EnumExpression ciudad;

    public QUbicacion(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.domicilio = new StringExpressionImpl(this, "domicilio");
        this.numero = new NumericExpressionImpl<Integer>(this, "numero");
        this.telefono = new StringExpressionImpl(this, "telefono");
        this.ciudad = new EnumExpressionImpl(this, "ciudad");
    }

    public QUbicacion(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.domicilio = new StringExpressionImpl(this, "domicilio");
        this.numero = new NumericExpressionImpl<Integer>(this, "numero");
        this.telefono = new StringExpressionImpl(this, "telefono");
        this.ciudad = new EnumExpressionImpl(this, "ciudad");
    }
}
