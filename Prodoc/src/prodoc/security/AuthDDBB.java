/*
 * OpenProdoc
 * 
 * See the help doc files distributed with
 * this work for additional information regarding copyright ownership.
 * Joaquin Hierro licenses this file to You under:
 * 
 * License GNU Affero GPL v3 http://www.gnu.org/licenses/agpl.html
 * 
 * you may not use this file except in compliance with the License.  
 * Unless agreed to in writing, software is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * author: Joaquin Hierro      2011
 * 
 */

package prodoc.security;

import java.sql.Connection;
import java.sql.DriverManager;
import prodoc.PDException;
import prodoc.PDExceptionFunc;

/**
 *
 * @author jhierrot
 */
public class AuthDDBB extends AuthGeneric
{
/**
 *
 * @param pServer
 * @param pUser
 * @param pPassword
 * @param pParam
 */
public AuthDDBB(String pServer, String pUser, String pPassword, String pParam)
{
super(pServer, pUser, pPassword, pParam);
}

//----------------------------------------------------------------------
/**
 *
 * @param User
 * @param Pass
 * @throws PDException
 */
@Override
public void Authenticate(String User, String Pass) throws PDException
{
Connection con=null;
try {
    Class.forName(getParam());
} catch (ClassNotFoundException ex)
    {
    PDException.GenPDException("Driver_JDBC_not_found",getParam()+"="+ex.getLocalizedMessage());
    }
try {
    DriverManager.setLoginTimeout(2);
    con = DriverManager.getConnection(getServer(), User, Pass);
    con.close();
} catch (Exception ex)
    {
    PDExceptionFunc.GenPDException("User_or_password_incorrect", User);
    }
}
//----------------------------------------------------------------------

}
