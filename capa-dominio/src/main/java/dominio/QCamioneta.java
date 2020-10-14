package dominio;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QCamioneta extends dominio.QVehiculo
{
    public static final QCamioneta jdoCandidate = candidate("this");

    public static QCamioneta candidate(String name)
    {
        return new QCamioneta(null, name, 5);
    }

    public static QCamioneta candidate()
    {
        return jdoCandidate;
    }

    public static QCamioneta parameter(String name)
    {
        return new QCamioneta(Camioneta.class, name, ExpressionType.PARAMETER);
    }

    public static QCamioneta variable(String name)
    {
        return new QCamioneta(Camioneta.class, name, ExpressionType.VARIABLE);
    }

    public final EnumExpression tipoMotor;

    public QCamioneta(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.tipoMotor = new EnumExpressionImpl(this, "tipoMotor");
    }

    public QCamioneta(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.tipoMotor = new EnumExpressionImpl(this, "tipoMotor");
    }
}
