package dominio;

import javax.annotation.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QTaller extends PersistableExpressionImpl<Taller> implements PersistableExpression<Taller>
{
    public static final QTaller jdoCandidate = candidate("this");

    public static QTaller candidate(String name)
    {
        return new QTaller(null, name, 5);
    }

    public static QTaller candidate()
    {
        return jdoCandidate;
    }

    public static QTaller parameter(String name)
    {
        return new QTaller(Taller.class, name, ExpressionType.PARAMETER);
    }

    public static QTaller variable(String name)
    {
        return new QTaller(Taller.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression nombre;
    public final dominio.QUbicacion ubicacion;
    public final dominio.QServicioGrua servicioGrua;
    public final BooleanExpression habilitado;
    public final ListExpression vehiculos;
    public final StringExpression habilitado2;

    public QTaller(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.nombre = new StringExpressionImpl(this, "nombre");
        if (depth > 0)
        {
            this.ubicacion = new dominio.QUbicacion(this, "ubicacion", depth-1);
        }
        else
        {
            this.ubicacion = null;
        }
        if (depth > 0)
        {
            this.servicioGrua = new dominio.QServicioGrua(this, "servicioGrua", depth-1);
        }
        else
        {
            this.servicioGrua = null;
        }
        this.habilitado = new BooleanExpressionImpl(this, "habilitado");
        this.vehiculos = new ListExpressionImpl(this, "vehiculos");
        this.habilitado2 = new StringExpressionImpl(this, "habilitado2");
    }

    public QTaller(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.nombre = new StringExpressionImpl(this, "nombre");
        this.ubicacion = new dominio.QUbicacion(this, "ubicacion", 5);
        this.servicioGrua = new dominio.QServicioGrua(this, "servicioGrua", 5);
        this.habilitado = new BooleanExpressionImpl(this, "habilitado");
        this.vehiculos = new ListExpressionImpl(this, "vehiculos");
        this.habilitado2 = new StringExpressionImpl(this, "habilitado2");
    }
}
