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

package prodoc;

/**
 *
 * @author jhierrot
 */
public class PDException extends Exception
{

/**
 *
 * @param TextExcep 
 */
public PDException(String TextExcep)
{
super(TextExcep);
//        throw new UnsupportedOperationException("Not yet implemented");
}
//----------------------------------------------------------------
/**
 * 
 * @param TextExcep
 * @param OptParam
 * @throws PDException
 */
public static void GenPDException(String TextExcep, String OptParam) throws PDException
{
String M;
if (OptParam==null || OptParam.length()==0)
    M=TextExcep;
else
    M=TextExcep+":"+OptParam;
PDLog.Error(M);
throw new PDException(M);
}
//----------------------------------------------------------------
}
