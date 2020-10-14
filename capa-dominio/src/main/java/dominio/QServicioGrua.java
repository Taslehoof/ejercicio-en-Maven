package dominio;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QServicioGrua extends PersistableExpressionImpl<ServicioGrua> implements PersistableExpression<ServicioGrua>
{
    public static final QServicioGrua jdoCandidate = candidate("this");

    public static QServicioGrua candidate(String name)
    {
        return new QServicioGrua(null, name, 5);
    }

    public static QServicioGrua candidate()
    {
        return jdoCandidate;
    }

    public static QServicioGrua parameter(String name)
    {
        return new QServicioGrua(ServicioGrua.class, name, ExpressionType.PARAMETER);
    }

    public static QServicioGrua variable(String name)
    {
        return new QServicioGrua(ServicioGrua.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression nombre;
    public final StringExpression telefono;
    public final NumericExpression<Double> precioAcarreo;

    public QServicioGrua(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.telefono = new StringExpressionImpl(this, "telefono");
        this.precioAcarreo = new NumericExpressionImpl<Double>(this, "precioAcarreo");
    }

    public QServicioGrua(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.telefono = new StringExpressionImpl(this, "telefono");
        this.precioAcarreo = new NumericExpressionImpl<Double>(this, "precioAcarreo");
    }
}
