//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.6
//
// <auto-generated>
//
// Generated from file `CoffeMach.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package servicios;

public interface ServicioComLogistica extends com.zeroc.Ice.Object
{
    java.util.List<java.lang.String> asignacionMaquina(int codigoOperador, com.zeroc.Ice.Current current);

    java.util.List<java.lang.String> asignacionMaquinasDesabastecidas(int codigoOperador, com.zeroc.Ice.Current current);

    boolean inicioSesion(int codigoOperador, String password, com.zeroc.Ice.Current current);

    /** @hidden */
    static final String[] _iceIds =
    {
        "::Ice::Object",
        "::servicios::ServicioComLogistica"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::servicios::ServicioComLogistica";
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_asignacionMaquina(ServicioComLogistica obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_codigoOperador;
        iceP_codigoOperador = istr.readInt();
        inS.endReadParams();
        java.util.List<java.lang.String> ret = obj.asignacionMaquina(iceP_codigoOperador, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        StringSeqHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_asignacionMaquinasDesabastecidas(ServicioComLogistica obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_codigoOperador;
        iceP_codigoOperador = istr.readInt();
        inS.endReadParams();
        java.util.List<java.lang.String> ret = obj.asignacionMaquinasDesabastecidas(iceP_codigoOperador, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        StringSeqHelper.write(ostr, ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_inicioSesion(ServicioComLogistica obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_codigoOperador;
        String iceP_password;
        iceP_codigoOperador = istr.readInt();
        iceP_password = istr.readString();
        inS.endReadParams();
        boolean ret = obj.inicioSesion(iceP_codigoOperador, iceP_password, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeBool(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    /** @hidden */
    final static String[] _iceOps =
    {
        "asignacionMaquina",
        "asignacionMaquinasDesabastecidas",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "inicioSesion"
    };

    /** @hidden */
    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _iceD_asignacionMaquina(this, in, current);
            }
            case 1:
            {
                return _iceD_asignacionMaquinasDesabastecidas(this, in, current);
            }
            case 2:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 3:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 4:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 5:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 6:
            {
                return _iceD_inicioSesion(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}