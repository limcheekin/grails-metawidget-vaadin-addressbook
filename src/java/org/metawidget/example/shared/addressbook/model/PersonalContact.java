// Metawidget
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

package org.metawidget.example.shared.addressbook.model;

import java.util.Date;

import org.metawidget.inspector.annotation.UiComesAfter;

/**
 * @author Richard Kennard
 */

public class PersonalContact
	extends Contact {

	//
	// Private members
	//

	private Date				mDateOfBirth;

	//
	// Constructor
	//

	public PersonalContact() {

		// Default constructor
	}

	public PersonalContact( String title, String firstname, String surname ) {

		super( title, firstname, surname );
	}

	public PersonalContact( PersonalContact personalContact ) {

		super( personalContact );

		mDateOfBirth = personalContact.mDateOfBirth;
	}

	//
	// Public methods
	//

	@UiComesAfter( "surname" )
	public Date getDateOfBirth() {

		return mDateOfBirth;
	}

	public void setDateOfBirth( Date dateOfBirth ) {

		mDateOfBirth = dateOfBirth;
	}
}
