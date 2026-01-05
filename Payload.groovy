/**
 * Handles creation and transmission of request payloads.
 *
 * <h2>Overview</h2>
 * This component builds and processes payloads (typically JSON) using Groovy
 * string literals or Maps. It documents safe and recommended approaches to
 * avoid escaping errors and unintended string interpolation.
 *
 * <h2>Supported Payload Forms</h2>
 *
 * <h3>1. Map-based payloads (Recommended)</h3>
 * Payloads can be defined as Groovy Maps and serialized to JSON.
 *
 * <pre>
 * def payload = [
 *   name  : "Alice",
 *   active: true,
 *   roles : ["admin", "user"]
 * ]
 *
 * def json = groovy.json.JsonOutput.toJson(payload)
 * </pre>
 *
 * This approach minimizes escaping issues and prevents malformed JSON.
 *
 * <h3>2. Static JSON strings</h3>
 * Use triple-single-quoted strings for static payloads.
 *
 * <pre>
 * def payload = '''
 * {
 *   "name": "Alice",
 *   "active": true
 * }
 * '''
 * </pre>
 *
 * Triple-single-quoted strings do not support interpolation and are safe for
 * raw JSON.
 *
 * <h3>3. Interpolated JSON strings</h3>
 * When dynamic values are required, triple-double-quoted strings may be used.
 *
 * <pre>
 * def name = "Alice"
 *
 * def payload = """
 * {
 *   "name": "${name}",
 *   "active": true
 * }
 * """
 * </pre>
 *
 * <strong>Warning:</strong> Interpolation can introduce invalid JSON if values
 * contain quotes or newlines. Prefer Map-based payloads where possible.
 *
 * <h2>Groovy String Types</h2>
 * <ul>
 *   <li><b>'single-quoted'</b> – no interpolation</li>
 *   <li><b>"double-quoted"</b> – supports interpolation (GString)</li>
 *   <li><b>'''triple-single-quoted'''</b> – multiline, no interpolation</li>
 *   <li><b>"""triple-double-quoted"""</b> – multiline with interpolation</li>
 * </ul>
 *
 * <h2>Escaping Rules</h2>
 * <ul>
 *   <li>Quotes inside JSON require escaping unless triple-quoted</li>
 *   <li>Backslashes must be escaped as <code>\\</code></li>
 *   <li>Literal dollar signs require <code>\$</code> in interpolated strings</li>
 * </ul>
 *
 * <h2>Parameters</h2>
 * @param payload payload content, either as a JSON String or Map
 * @param headers optional HTTP headers
 *
 * <h2>Returns</h2>
 * @return response status or result object
 *
 * <h2>Best Practices</h2>
 * <ul>
 *   <li>Prefer Maps + JsonOutput over manual JSON strings</li>
 *   <li>Use triple-single-quoted strings for static payloads</li>
 *   <li>Avoid GString interpolation in JSON unless necessary</li>
 *   <li>Keep payload examples concise using &lt;pre&gt; blocks</li>
 * </ul>
 *
 * @since 1.0
 * @see groovy.json.JsonOutput
 */
