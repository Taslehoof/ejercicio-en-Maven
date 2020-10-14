package dominio;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPropietario extends PersistableExpressionImpl<Propietario> implements PersistableExpression<Propietario>
{
    public static final QPropietario jdoCandidate = candidate("this");

    public static QPropietario candidate(String name)
    {
        return new QPropietario(null, name, 5);
    }

    public static QPropietario candidate()
    {
        return jdoCandidate;
    }

    public static QPropietario parameter(String name)
    {
        return new QPropietario(Propietario.class, name, ExpressionType.PARAMETER);
    }

    public static QPropietario variable(String name)
    {
        return new QPropietario(Propietario.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression nombre;
    public final StringExpression apellido;
    public final NumericExpression<Integer> documento;
    public final StringExpression telefono;
    public final dominio.QVehiculo vehiculo;

    public QPropietario(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.apellido = new StringExpressionImpl(this, "apellido");
        this.documento = new NumericExpressionImpl<Integer>(this, "documento");
        this.telefono = new StringExpressionImpl(this, "telefono");
        if (depth > 0)
        {
            this.vehiculo = new dominio.QVehiculo(this, "vehiculo", depth-1);
        }
        else
        {
            this.vehiculo = null;
        }
    }

    public QPropietario(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.apellido = new StringExpressionImpl(this, "apellido");
        this.documento = new NumericExpressionImpl<Integer>(this, "documento");
        this.telefono = new StringExpressionImpl(this, "telefono");
        this.vehiculo = new dominio.QVehiculo(this, "vehiculo", 5);
    }
}
