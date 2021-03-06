/**
 */
package org.eclipse.xtext.xdoc.xdoc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xdoc.xdoc.AbstractSection;
import org.eclipse.xtext.xdoc.xdoc.TextOrMarkup;
import org.eclipse.xtext.xdoc.xdoc.XdocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.AbstractSectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.xtext.xdoc.xdoc.impl.AbstractSectionImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractSectionImpl extends IdentifiableImpl implements AbstractSection
{
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TextOrMarkup title;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<TextOrMarkup> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSectionImpl()
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
		return XdocPackage.Literals.ABSTRACT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOrMarkup getTitle()
	{
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TextOrMarkup newTitle, NotificationChain msgs)
	{
		TextOrMarkup oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XdocPackage.ABSTRACT_SECTION__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TextOrMarkup newTitle)
	{
		if (newTitle != title)
		{
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XdocPackage.ABSTRACT_SECTION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XdocPackage.ABSTRACT_SECTION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XdocPackage.ABSTRACT_SECTION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextOrMarkup> getContents()
	{
		if (contents == null)
		{
			contents = new EObjectContainmentEList<TextOrMarkup>(TextOrMarkup.class, this, XdocPackage.ABSTRACT_SECTION__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case XdocPackage.ABSTRACT_SECTION__TITLE:
				return basicSetTitle(null, msgs);
			case XdocPackage.ABSTRACT_SECTION__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case XdocPackage.ABSTRACT_SECTION__TITLE:
				return getTitle();
			case XdocPackage.ABSTRACT_SECTION__CONTENTS:
				return getContents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case XdocPackage.ABSTRACT_SECTION__TITLE:
				setTitle((TextOrMarkup)newValue);
				return;
			case XdocPackage.ABSTRACT_SECTION__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends TextOrMarkup>)newValue);
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
			case XdocPackage.ABSTRACT_SECTION__TITLE:
				setTitle((TextOrMarkup)null);
				return;
			case XdocPackage.ABSTRACT_SECTION__CONTENTS:
				getContents().clear();
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
			case XdocPackage.ABSTRACT_SECTION__TITLE:
				return title != null;
			case XdocPackage.ABSTRACT_SECTION__CONTENTS:
				return contents != null && !contents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractSectionImpl
