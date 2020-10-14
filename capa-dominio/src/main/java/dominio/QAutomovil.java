package dominio;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QAutomovil extends dominio.QVehiculo
{
    public static final QAutomovil jdoCandidate = candidate("this");

    public static QAutomovil candidate(String name)
    {
        return new QAutomovil(null, name, 5);
    }

    public static QAutomovil candidate()
    {
        return jdoCandidate;
    }

    public static QAutomovil parameter(String name)
    {
        return new QAutomovil(Automovil.class, name, ExpressionType.PARAMETER);
    }

    public static QAutomovil variable(String name)
    {
        return new QAutomovil(Automovil.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression marca;
    public final StringExpression modelo;

    public QAutomovil(PersistableExpression parent, String name, int depth)
    {
        super(parent, name, depth);
        this.marca = new StringExpressionImpl(this, "marca");
        this.modelo = new StringExpressionImpl(this, "modelo");
    }

    public QAutomovil(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.marca = new StringExpressionImpl(this, "marca");
        this.modelo = new StringExpressionImpl(this, "modelo");
    }
}
