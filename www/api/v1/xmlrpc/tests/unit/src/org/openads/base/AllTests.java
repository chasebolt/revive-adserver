/*
+---------------------------------------------------------------------------+
| OpenX v${RELEASE_MAJOR_MINOR}                                                              |
| ======${RELEASE_MAJOR_MINOR_DOUBLE_UNDERLINE}                                                                 |
|                                                                           |
| Copyright (c) 2003-2008 m3 Media Services Ltd                             |
| For contact details, see: http://www.openads.org/                         |
|                                                                           |
| This program is free software; you can redistribute it and/or modify      |
| it under the terms of the GNU General Public License as published by      |
| the Free Software Foundation; either version 2 of the License, or         |
| (at your option) any later version.                                       |
|                                                                           |
| This program is distributed in the hope that it will be useful,           |
| but WITHOUT ANY WARRANTY; without even the implied warranty of            |
| MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the             |
| GNU General Public License for more details.                              |
|                                                                           |
| You should have received a copy of the GNU General Public License         |
| along with this program; if not, write to the Free Software               |
| Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA |
+---------------------------------------------------------------------------+
$Id:$
*/

package org.openads.base;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.openads.advertiser.TestAdvertiser;
import org.openads.agency.TestAgency;
import org.openads.banner.TestBanner;
import org.openads.campaign.TestCampaign;
import org.openads.publisher.TestPublisher;
import org.openads.zone.TestZone;

/**
 * Run all tests
 *
 * @author     Andriy Petlyovanyy <apetlyovanyy@lohika.com>
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("All tests");

		suite.addTest(TestAdvertiser.suite());
		suite.addTest(TestAgency.suite());
		suite.addTest(TestBanner.suite());
		suite.addTest(TestCampaign.suite());
		suite.addTest(TestPublisher.suite());
		suite.addTest(TestZone.suite());

		return suite;
	}

}
