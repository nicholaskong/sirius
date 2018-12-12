/*******************************************************************************
 * Copyright (c) 2010, 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.sample.interactions.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.sirius.sample.interactions.util.InteractionsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support
 * Viewers. The adapters generated by this factory convert EMF adapter
 * notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The
 * adapters also support Eclipse property sheets. Note that most of the adapters
 * are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class InteractionsItemProviderAdapterFactory extends InteractionsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this
     * adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement
     * {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by
     * {@link #isFactoryForType isFactoryForType}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    public InteractionsItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.Model} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ModelItemProvider modelItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.Model}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createModelAdapter() {
        if (modelItemProvider == null) {
            modelItemProvider = new ModelItemProvider(this);
        }

        return modelItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.Interaction} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InteractionItemProvider interactionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.Interaction}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createInteractionAdapter() {
        if (interactionItemProvider == null) {
            interactionItemProvider = new InteractionItemProvider(this);
        }

        return interactionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.Participant} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ParticipantItemProvider participantItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.Participant}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createParticipantAdapter() {
        if (participantItemProvider == null) {
            participantItemProvider = new ParticipantItemProvider(this);
        }

        return participantItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.CallMessage} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CallMessageItemProvider callMessageItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.CallMessage}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCallMessageAdapter() {
        if (callMessageItemProvider == null) {
            callMessageItemProvider = new CallMessageItemProvider(this);
        }

        return callMessageItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.FeatureAccessMessage}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FeatureAccessMessageItemProvider featureAccessMessageItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.FeatureAccessMessage}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createFeatureAccessMessageAdapter() {
        if (featureAccessMessageItemProvider == null) {
            featureAccessMessageItemProvider = new FeatureAccessMessageItemProvider(this);
        }

        return featureAccessMessageItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.CreateParticipantMessage}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CreateParticipantMessageItemProvider createParticipantMessageItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.CreateParticipantMessage}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCreateParticipantMessageAdapter() {
        if (createParticipantMessageItemProvider == null) {
            createParticipantMessageItemProvider = new CreateParticipantMessageItemProvider(this);
        }

        return createParticipantMessageItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.DestroyParticipantMessage}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DestroyParticipantMessageItemProvider destroyParticipantMessageItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.DestroyParticipantMessage}.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDestroyParticipantMessageAdapter() {
        if (destroyParticipantMessageItemProvider == null) {
            destroyParticipantMessageItemProvider = new DestroyParticipantMessageItemProvider(this);
        }

        return destroyParticipantMessageItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.ReturnMessage} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ReturnMessageItemProvider returnMessageItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.ReturnMessage}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createReturnMessageAdapter() {
        if (returnMessageItemProvider == null) {
            returnMessageItemProvider = new ReturnMessageItemProvider(this);
        }

        return returnMessageItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.Execution} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExecutionItemProvider executionItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.Execution}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createExecutionAdapter() {
        if (executionItemProvider == null) {
            executionItemProvider = new ExecutionItemProvider(this);
        }

        return executionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.State} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected StateItemProvider stateItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.State}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createStateAdapter() {
        if (stateItemProvider == null) {
            stateItemProvider = new StateItemProvider(this);
        }

        return stateItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.InteractionUse} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InteractionUseItemProvider interactionUseItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.InteractionUse}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createInteractionUseAdapter() {
        if (interactionUseItemProvider == null) {
            interactionUseItemProvider = new InteractionUseItemProvider(this);
        }

        return interactionUseItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.CombinedFragment}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CombinedFragmentItemProvider combinedFragmentItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.CombinedFragment}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCombinedFragmentAdapter() {
        if (combinedFragmentItemProvider == null) {
            combinedFragmentItemProvider = new CombinedFragmentItemProvider(this);
        }

        return combinedFragmentItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.Operand} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OperandItemProvider operandItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.Operand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createOperandAdapter() {
        if (operandItemProvider == null) {
            operandItemProvider = new OperandItemProvider(this);
        }

        return operandItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.MessageEnd} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MessageEndItemProvider messageEndItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.MessageEnd}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createMessageEndAdapter() {
        if (messageEndItemProvider == null) {
            messageEndItemProvider = new MessageEndItemProvider(this);
        }

        return messageEndItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.ExecutionEnd} instances.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExecutionEndItemProvider executionEndItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.ExecutionEnd}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createExecutionEndAdapter() {
        if (executionEndItemProvider == null) {
            executionEndItemProvider = new ExecutionEndItemProvider(this);
        }

        return executionEndItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.StateEnd} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected StateEndItemProvider stateEndItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.StateEnd}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createStateEndAdapter() {
        if (stateEndItemProvider == null) {
            stateEndItemProvider = new StateEndItemProvider(this);
        }

        return stateEndItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.InteractionUseEnd}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InteractionUseEndItemProvider interactionUseEndItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.InteractionUseEnd}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createInteractionUseEndAdapter() {
        if (interactionUseEndItemProvider == null) {
            interactionUseEndItemProvider = new InteractionUseEndItemProvider(this);
        }

        return interactionUseEndItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.CombinedFragmentEnd}
     * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CombinedFragmentEndItemProvider combinedFragmentEndItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.CombinedFragmentEnd}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createCombinedFragmentEndAdapter() {
        if (combinedFragmentEndItemProvider == null) {
            combinedFragmentEndItemProvider = new CombinedFragmentEndItemProvider(this);
        }

        return combinedFragmentEndItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.OperandEnd} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OperandEndItemProvider operandEndItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.OperandEnd}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createOperandEndAdapter() {
        if (operandEndItemProvider == null) {
            operandEndItemProvider = new OperandEndItemProvider(this);
        }

        return operandEndItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.MixEnd} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MixEndItemProvider mixEndItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.MixEnd}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createMixEndAdapter() {
        if (mixEndItemProvider == null) {
            mixEndItemProvider = new MixEndItemProvider(this);
        }

        return mixEndItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.eclipse.sirius.sample.interactions.Constraint} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ConstraintItemProvider constraintItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.eclipse.sirius.sample.interactions.Constraint}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createConstraintAdapter() {
        if (constraintItemProvider == null) {
            constraintItemProvider = new ConstraintItemProvider(this);
        }

        return constraintItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the
     * adapter. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to
     * {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void dispose() {
        if (modelItemProvider != null) {
            modelItemProvider.dispose();
        }
        if (interactionItemProvider != null) {
            interactionItemProvider.dispose();
        }
        if (participantItemProvider != null) {
            participantItemProvider.dispose();
        }
        if (callMessageItemProvider != null) {
            callMessageItemProvider.dispose();
        }
        if (featureAccessMessageItemProvider != null) {
            featureAccessMessageItemProvider.dispose();
        }
        if (createParticipantMessageItemProvider != null) {
            createParticipantMessageItemProvider.dispose();
        }
        if (destroyParticipantMessageItemProvider != null) {
            destroyParticipantMessageItemProvider.dispose();
        }
        if (returnMessageItemProvider != null) {
            returnMessageItemProvider.dispose();
        }
        if (executionItemProvider != null) {
            executionItemProvider.dispose();
        }
        if (stateItemProvider != null) {
            stateItemProvider.dispose();
        }
        if (interactionUseItemProvider != null) {
            interactionUseItemProvider.dispose();
        }
        if (combinedFragmentItemProvider != null) {
            combinedFragmentItemProvider.dispose();
        }
        if (operandItemProvider != null) {
            operandItemProvider.dispose();
        }
        if (messageEndItemProvider != null) {
            messageEndItemProvider.dispose();
        }
        if (executionEndItemProvider != null) {
            executionEndItemProvider.dispose();
        }
        if (stateEndItemProvider != null) {
            stateEndItemProvider.dispose();
        }
        if (interactionUseEndItemProvider != null) {
            interactionUseEndItemProvider.dispose();
        }
        if (combinedFragmentEndItemProvider != null) {
            combinedFragmentEndItemProvider.dispose();
        }
        if (operandEndItemProvider != null) {
            operandEndItemProvider.dispose();
        }
        if (mixEndItemProvider != null) {
            mixEndItemProvider.dispose();
        }
        if (constraintItemProvider != null) {
            constraintItemProvider.dispose();
        }
    }

}