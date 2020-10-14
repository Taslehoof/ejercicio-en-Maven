package dominio;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QVehiculo extends PersistableExpressionImpl<Vehiculo> implements PersistableExpression<Vehiculo>
{
    public static final QVehiculo jdoCandidate = candidate("this");

    public static QVehiculo candidate(String name)
    {
        return new QVehiculo(null, name, 5);
    }

    public static QVehiculo candidate()
    {
        return jdoCandidate;
    }

    public static QVehiculo parameter(String name)
    {
        return new QVehiculo(Vehiculo.class, name, ExpressionType.PARAMETER);
    }

    public static QVehiculo variable(String name)
    {
        return new QVehiculo(Vehiculo.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression matricula;
    public final LocalDateExpression fechaIngreso;
    public final dominio.QTaller taller;
    public final dominio.QPropietario propietario;

    public QVehiculo(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.matricula = new StringExpressionImpl(this, "matricula");
        this.fechaIngreso = new LocalDateExpressionImpl(this, "fechaIngreso");
        if (depth > 0)
        {
            this.taller = new dominio.QTaller(this, "taller", depth-1);
        }
        else
        {
            this.taller = null;
        }
        if (depth > 0)
        {
            this.propietario = new dominio.QPropietario(this, "propietario", depth-1);
        }
        else
        {
            this.propietario = null;
        }
    }

    public QVehiculo(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.matricula = new StringExpressionImpl(this, "matricula");
        this.fechaIngreso = new LocalDateExpressionImpl(this, "fechaIngreso");
        this.taller = new dominio.QTaller(this, "taller", 5);
        this.propietario = new dominio.QPropietario(this, "propietario", 5);
    }
}
