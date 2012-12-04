package edu.hm.basic.object;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Klasse fuer ein Tupel von zwei Werten.
 * 
 * @param <T>
 *            Typ des ersten Werts
 * @param <S>
 *            Typ des zweiten Werts
 * @author Stefan Wörner
 */
public class Tupel<T, S> extends AbstractBasicObject
{

	private static final long serialVersionUID = -4162418247655381471L;

	private T m_first;

	private S m_second;

	/**
	 * Konstruktor.
	 * 
	 * @param first
	 *            erster Eintrag
	 * @param second
	 *            zweiter Eintrag
	 */
	public Tupel( T first, S second )
	{
		m_first = first;
		m_second = second;
	}

	/**
	 * Gibt den ersten Tupeleintrag zurück.
	 * 
	 * @return first
	 */
	public T getFirst()
	{
		return m_first;
	}

	/**
	 * Gibt den zweiten Tupeleintrag zurück.
	 * 
	 * @return second
	 */
	public S getSecond()
	{
		return m_second;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see edu.hm.basic.object.AbstractBasicObject#getExclusionList()
	 */
	@Override
	protected String[] getExclusionList()
	{
		return new String[] {};
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see edu.hm.basic.object.AbstractBasicObject#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode( INITIAL_NON_ZERO_ODD_NUMBER, MULTIPLIER_NON_ZERO_ODD_NUMBER, this, true,
				Tupel.class, getExclusionList() );
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see edu.hm.basic.object.AbstractBasicObject#equals(java.lang.Object)
	 */
	@Override
	public boolean equals( Object obj )
	{
		return EqualsBuilder.reflectionEquals( this, obj, true, Tupel.class, getExclusionList() );
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		ReflectionToStringBuilder rsb = new ReflectionToStringBuilder( this, ToStringStyle.SHORT_PREFIX_STYLE );
		rsb.setAppendStatics( false );
		rsb.setAppendTransients( true );
		rsb.setUpToClass( Tupel.class );
		rsb.setExcludeFieldNames( getExclusionList() );
		return rsb.toString();
	}
}
