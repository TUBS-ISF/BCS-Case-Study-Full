/**
 */
package org.xtext.deltarx.deltarx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.deltarx.deltarx.ConnectorTypeOne;
import org.xtext.deltarx.deltarx.DeltarxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeOneImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeOneImpl#getPortnameone <em>Portnameone</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeOneImpl#getSignaltypeone <em>Signaltypeone</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeOneImpl#getSignaltypetwo <em>Signaltypetwo</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeOneImpl#getPortnametwo <em>Portnametwo</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeOneImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorTypeOneImpl extends MinimalEObjectImpl.Container implements ConnectorTypeOne
{
  /**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected String source = SOURCE_EDEFAULT;

  /**
   * The default value of the '{@link #getPortnameone() <em>Portnameone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortnameone()
   * @generated
   * @ordered
   */
  protected static final String PORTNAMEONE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPortnameone() <em>Portnameone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortnameone()
   * @generated
   * @ordered
   */
  protected String portnameone = PORTNAMEONE_EDEFAULT;

  /**
   * The default value of the '{@link #getSignaltypeone() <em>Signaltypeone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignaltypeone()
   * @generated
   * @ordered
   */
  protected static final String SIGNALTYPEONE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSignaltypeone() <em>Signaltypeone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignaltypeone()
   * @generated
   * @ordered
   */
  protected String signaltypeone = SIGNALTYPEONE_EDEFAULT;

  /**
   * The default value of the '{@link #getSignaltypetwo() <em>Signaltypetwo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignaltypetwo()
   * @generated
   * @ordered
   */
  protected static final String SIGNALTYPETWO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSignaltypetwo() <em>Signaltypetwo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignaltypetwo()
   * @generated
   * @ordered
   */
  protected String signaltypetwo = SIGNALTYPETWO_EDEFAULT;

  /**
   * The default value of the '{@link #getPortnametwo() <em>Portnametwo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortnametwo()
   * @generated
   * @ordered
   */
  protected static final String PORTNAMETWO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPortnametwo() <em>Portnametwo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortnametwo()
   * @generated
   * @ordered
   */
  protected String portnametwo = PORTNAMETWO_EDEFAULT;

  /**
   * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected String destination = DESTINATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectorTypeOneImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DeltarxPackage.Literals.CONNECTOR_TYPE_ONE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(String newSource)
  {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.CONNECTOR_TYPE_ONE__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPortnameone()
  {
    return portnameone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortnameone(String newPortnameone)
  {
    String oldPortnameone = portnameone;
    portnameone = newPortnameone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.CONNECTOR_TYPE_ONE__PORTNAMEONE, oldPortnameone, portnameone));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSignaltypeone()
  {
    return signaltypeone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignaltypeone(String newSignaltypeone)
  {
    String oldSignaltypeone = signaltypeone;
    signaltypeone = newSignaltypeone;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.CONNECTOR_TYPE_ONE__SIGNALTYPEONE, oldSignaltypeone, signaltypeone));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSignaltypetwo()
  {
    return signaltypetwo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignaltypetwo(String newSignaltypetwo)
  {
    String oldSignaltypetwo = signaltypetwo;
    signaltypetwo = newSignaltypetwo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.CONNECTOR_TYPE_ONE__SIGNALTYPETWO, oldSignaltypetwo, signaltypetwo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPortnametwo()
  {
    return portnametwo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortnametwo(String newPortnametwo)
  {
    String oldPortnametwo = portnametwo;
    portnametwo = newPortnametwo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.CONNECTOR_TYPE_ONE__PORTNAMETWO, oldPortnametwo, portnametwo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(String newDestination)
  {
    String oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.CONNECTOR_TYPE_ONE__DESTINATION, oldDestination, destination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SOURCE:
        return getSource();
      case DeltarxPackage.CONNECTOR_TYPE_ONE__PORTNAMEONE:
        return getPortnameone();
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SIGNALTYPEONE:
        return getSignaltypeone();
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SIGNALTYPETWO:
        return getSignaltypetwo();
      case DeltarxPackage.CONNECTOR_TYPE_ONE__PORTNAMETWO:
        return getPortnametwo();
      case DeltarxPackage.CONNECTOR_TYPE_ONE__DESTINATION:
        return getDestination();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SOURCE:
        setSource((String)newValue);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_ONE__PORTNAMEONE:
        setPortnameone((String)newValue);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SIGNALTYPEONE:
        setSignaltypeone((String)newValue);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SIGNALTYPETWO:
        setSignaltypetwo((String)newValue);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_ONE__PORTNAMETWO:
        setPortnametwo((String)newValue);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_ONE__DESTINATION:
        setDestination((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_ONE__PORTNAMEONE:
        setPortnameone(PORTNAMEONE_EDEFAULT);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SIGNALTYPEONE:
        setSignaltypeone(SIGNALTYPEONE_EDEFAULT);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SIGNALTYPETWO:
        setSignaltypetwo(SIGNALTYPETWO_EDEFAULT);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_ONE__PORTNAMETWO:
        setPortnametwo(PORTNAMETWO_EDEFAULT);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_ONE__DESTINATION:
        setDestination(DESTINATION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case DeltarxPackage.CONNECTOR_TYPE_ONE__PORTNAMEONE:
        return PORTNAMEONE_EDEFAULT == null ? portnameone != null : !PORTNAMEONE_EDEFAULT.equals(portnameone);
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SIGNALTYPEONE:
        return SIGNALTYPEONE_EDEFAULT == null ? signaltypeone != null : !SIGNALTYPEONE_EDEFAULT.equals(signaltypeone);
      case DeltarxPackage.CONNECTOR_TYPE_ONE__SIGNALTYPETWO:
        return SIGNALTYPETWO_EDEFAULT == null ? signaltypetwo != null : !SIGNALTYPETWO_EDEFAULT.equals(signaltypetwo);
      case DeltarxPackage.CONNECTOR_TYPE_ONE__PORTNAMETWO:
        return PORTNAMETWO_EDEFAULT == null ? portnametwo != null : !PORTNAMETWO_EDEFAULT.equals(portnametwo);
      case DeltarxPackage.CONNECTOR_TYPE_ONE__DESTINATION:
        return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (source: ");
    result.append(source);
    result.append(", portnameone: ");
    result.append(portnameone);
    result.append(", signaltypeone: ");
    result.append(signaltypeone);
    result.append(", signaltypetwo: ");
    result.append(signaltypetwo);
    result.append(", portnametwo: ");
    result.append(portnametwo);
    result.append(", destination: ");
    result.append(destination);
    result.append(')');
    return result.toString();
  }

} //ConnectorTypeOneImpl
