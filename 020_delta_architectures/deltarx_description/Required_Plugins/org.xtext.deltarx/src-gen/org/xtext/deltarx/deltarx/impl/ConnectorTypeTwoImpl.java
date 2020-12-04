/**
 */
package org.xtext.deltarx.deltarx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.deltarx.deltarx.ConnectorTypeTwo;
import org.xtext.deltarx.deltarx.DeltarxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type Two</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeTwoImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeTwoImpl#getSourcesignal <em>Sourcesignal</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeTwoImpl#getDestinationsignal <em>Destinationsignal</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeTwoImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorTypeTwoImpl extends MinimalEObjectImpl.Container implements ConnectorTypeTwo
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
   * The default value of the '{@link #getSourcesignal() <em>Sourcesignal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcesignal()
   * @generated
   * @ordered
   */
  protected static final String SOURCESIGNAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourcesignal() <em>Sourcesignal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourcesignal()
   * @generated
   * @ordered
   */
  protected String sourcesignal = SOURCESIGNAL_EDEFAULT;

  /**
   * The default value of the '{@link #getDestinationsignal() <em>Destinationsignal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationsignal()
   * @generated
   * @ordered
   */
  protected static final String DESTINATIONSIGNAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestinationsignal() <em>Destinationsignal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationsignal()
   * @generated
   * @ordered
   */
  protected String destinationsignal = DESTINATIONSIGNAL_EDEFAULT;

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
  protected ConnectorTypeTwoImpl()
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
    return DeltarxPackage.Literals.CONNECTOR_TYPE_TWO;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.CONNECTOR_TYPE_TWO__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourcesignal()
  {
    return sourcesignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourcesignal(String newSourcesignal)
  {
    String oldSourcesignal = sourcesignal;
    sourcesignal = newSourcesignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.CONNECTOR_TYPE_TWO__SOURCESIGNAL, oldSourcesignal, sourcesignal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestinationsignal()
  {
    return destinationsignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestinationsignal(String newDestinationsignal)
  {
    String oldDestinationsignal = destinationsignal;
    destinationsignal = newDestinationsignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.CONNECTOR_TYPE_TWO__DESTINATIONSIGNAL, oldDestinationsignal, destinationsignal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.CONNECTOR_TYPE_TWO__DESTINATION, oldDestination, destination));
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
      case DeltarxPackage.CONNECTOR_TYPE_TWO__SOURCE:
        return getSource();
      case DeltarxPackage.CONNECTOR_TYPE_TWO__SOURCESIGNAL:
        return getSourcesignal();
      case DeltarxPackage.CONNECTOR_TYPE_TWO__DESTINATIONSIGNAL:
        return getDestinationsignal();
      case DeltarxPackage.CONNECTOR_TYPE_TWO__DESTINATION:
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
      case DeltarxPackage.CONNECTOR_TYPE_TWO__SOURCE:
        setSource((String)newValue);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_TWO__SOURCESIGNAL:
        setSourcesignal((String)newValue);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_TWO__DESTINATIONSIGNAL:
        setDestinationsignal((String)newValue);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_TWO__DESTINATION:
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
      case DeltarxPackage.CONNECTOR_TYPE_TWO__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_TWO__SOURCESIGNAL:
        setSourcesignal(SOURCESIGNAL_EDEFAULT);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_TWO__DESTINATIONSIGNAL:
        setDestinationsignal(DESTINATIONSIGNAL_EDEFAULT);
        return;
      case DeltarxPackage.CONNECTOR_TYPE_TWO__DESTINATION:
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
      case DeltarxPackage.CONNECTOR_TYPE_TWO__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case DeltarxPackage.CONNECTOR_TYPE_TWO__SOURCESIGNAL:
        return SOURCESIGNAL_EDEFAULT == null ? sourcesignal != null : !SOURCESIGNAL_EDEFAULT.equals(sourcesignal);
      case DeltarxPackage.CONNECTOR_TYPE_TWO__DESTINATIONSIGNAL:
        return DESTINATIONSIGNAL_EDEFAULT == null ? destinationsignal != null : !DESTINATIONSIGNAL_EDEFAULT.equals(destinationsignal);
      case DeltarxPackage.CONNECTOR_TYPE_TWO__DESTINATION:
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
    result.append(", sourcesignal: ");
    result.append(sourcesignal);
    result.append(", destinationsignal: ");
    result.append(destinationsignal);
    result.append(", destination: ");
    result.append(destination);
    result.append(')');
    return result.toString();
  }

} //ConnectorTypeTwoImpl
